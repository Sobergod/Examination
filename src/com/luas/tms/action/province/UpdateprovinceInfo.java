package com.luas.tms.action.province;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luas.tms.entity.Department;
import com.luas.tms.helper.CookieHelper;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.city.CityBaseInfoSerivce;
import com.luas.tms.serivce.province.ProvinceBaseInfoService;
import com.luas.tms.serivce.province.UpdataProvinceService;
import com.luas.tms.util.InvokeResult;

public class UpdateprovinceInfo implements Action {

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		CookieHelper cookieHelper = new CookieHelper(request, response);
		String loginIdStr = cookieHelper.getCookieByName("loginId");//1.取到loginId
		int loginId = Integer.parseInt(loginIdStr);
		
		CityBaseInfoSerivce cityBaseInfoService = new CityBaseInfoSerivce();
		InvokeResult<Department> invokeResult = cityBaseInfoService
				.findOneDepartmentByLoginId(loginId);
		if (invokeResult.isSuccess()) {
			request.setAttribute("department", invokeResult.getResult());
		} else {
			request.setAttribute("errorTip", invokeResult.getExceptionMessage());
		}
		/**
		 * 修改省的基本信息
		 */
		String departmentAddress = request.getParameter("departmentAddress");
		String departmentPhone = request.getParameter("departmentPhone");
		String loginRealName = request.getParameter("loginRealName");
		if(departmentAddress==null || departmentAddress == ""){
			request.setAttribute("errorAddress", "地址不能为空");
			return new ActionForward("/page/province/baseinfo_modify.jsp");
		}
		if(departmentPhone == null || departmentPhone == ""){
			request.setAttribute("errorPhone", "电话不能为空");
			return new ActionForward("/page/province/baseinfo_modify.jsp");
		}
		if(loginRealName == null || loginRealName == ""){
			request.setAttribute("errorName", "真实姓名不能为空");
			return new ActionForward("/page/province/baseinfo_modify.jsp");
		}
		int deparmentId = invokeResult.getResult().getId();// 得到部门的id			//从invokeResult对象里面获取departmentid	方法2

		UpdataProvinceService updataProvince = new UpdataProvinceService();
		updataProvince.UpdataProvinceInfoServiceByDepartmentId(deparmentId,
				departmentAddress, departmentPhone,loginRealName,loginId);// 根据departmentId调用service里面的方法    修改department表
		return new ActionForward("/province/provinceShowBaseInfo.do");
	}

}
