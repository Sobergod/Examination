package com.luas.tms.action.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.entity.Login;
import com.luas.tms.helper.CookieHelper;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.common.SecurityService;
import com.luas.tms.util.InvokeResult;

public class LoginAction implements Action {

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 1.获取登陆页面提交来的信息
		String loginName = request.getParameter("loginName");
		String loginPassword = request.getParameter("loginPassword");
		String userTypeId = request.getParameter("userTypeId");
		//userTypeId是登陆的各个级别  
		//如果是省登录userTypeId就是5
		System.out.println(userTypeId+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+userTypeId);
		
		//2.合法性验证
		if (loginName == null || loginName.equals("") || loginPassword == null
				|| loginPassword.equals("") || userTypeId == null
				|| userTypeId.equals("")) {
			return new ActionForward("/login.jsp");
		}
		
		SecurityService securityService = new SecurityService();
		InvokeResult<Login> invokeResult = securityService.findOneLoginByNameAndPasswordAndType(loginName,loginPassword,userTypeId);
		
		if(invokeResult.isSuccess()){
			Login login = invokeResult.getResult();
			
			//如果用户登录成功就将用户的信息放到Cookie中去
			CookieHelper cookieHelper = new CookieHelper(request, response);
			cookieHelper.writeCookie("loginId", login.getId() + "");
			cookieHelper.writeCookie("loginName", login.getLoginName());
			cookieHelper.writeCookie("realName", login.getRealName());
			cookieHelper.writeCookie("userTypeId", login.getUserType().getId() + "");
			
			//将用户的信息放到request中
			request.setAttribute("loginId", login.getId() + "");
			request.setAttribute("loginName", login.getLoginName());
			request.setAttribute("userTypeId", login.getUserType().getId() + "");
			request.setAttribute("realName", login.getRealName());//realName的值如admin----对应的userTypeId=5
			
			if(login.getUserType().getId() == 1){//userTyPeId为1的时候代表的是教师
				request.setAttribute("userTypeStr", "teacher");
				return new ActionForward("/page/common/main.jsp");
			}else if(login.getUserType().getId() == 2){//userTypeId为2的时候代表的是学校
				request.setAttribute("userTypeStr", "school");
				return new ActionForward("/page/common/main.jsp");
			}else if(login.getUserType().getId() == 3){//userTypeId为3的时候代表的是县
				request.setAttribute("userTypeStr", "area");
				return new ActionForward("/page/common/main.jsp");
			}else if(login.getUserType().getId() == 4){//userTypeId为4的时候代表的是市
				request.setAttribute("userTypeStr", "city");
				return new ActionForward("/page/common/main.jsp");
			}else if(login.getUserType().getId() == 5){//userTypeId为5的时候代表的是省份
				request.setAttribute("userTypeStr", "province");
				return new ActionForward("/page/common/main.jsp");
			}else{
				request.removeAttribute("userTypeStr");
				return new ActionForward("/login.jsp");
			}
			
			
		}else{
			request.setAttribute("errorTip", "账号和密码不能为空！！！");
			return new ActionForward("/login.jsp");
		}
		
	}

}
