package com.luas.tms.action.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.helper.CookieHelper;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.province.UpdataProvinceService;
import com.luas.tms.util.InvokeResult;

public class UpdataProvincePassword implements Action{

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
        String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		String userTypeIdStr = request.getParameter("userTypeId");
		if(userTypeIdStr ==  null)
		{
			 return new ActionForward("/changePassword.jsp");
		}
		else{
			int userTypeId = Integer.valueOf(userTypeIdStr);
			
			if(oldPassword==null || oldPassword == ""){
				request.setAttribute("nullOldPassword", "请填写旧密码");
				return new ActionForward("/changePassword.jsp");
			}else{
				//�����ݿ������ȡ������Ƚ�����������Ƿ���ȷ
				UpdataProvinceService updatePassService = new UpdataProvinceService();
				InvokeResult<Integer> finalResult = updatePassService.Changepassword(newPassword, userTypeId);
				System.out.println(finalResult.getResult());
			}
			
			
			if(newPassword==null || newPassword == ""){
				request.setAttribute("errorNewPassword", "新密码不能为空");
				return new ActionForward("/changePassword.jsp");
			}
			
			if(confirmPassword == null || confirmPassword==""){
				request.setAttribute("errorConfirmPassword", "两次密码不相等确认密码不能为空");
				return new ActionForward("/changePassword.jsp");
			}
			
			if(!confirmPassword.equals(newPassword)){
				request.setAttribute("errorNotEqual", "两次密码不相等");
				return new ActionForward("/changePassword.jsp");
			}
			
		}
		
		return new ActionForward("/changePasswordSucc.jsp");
	}
	
}
