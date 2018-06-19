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
		String loginIdStr = cookieHelper.getCookieByName("loginId");//1.ȡ��loginId
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
		 * �޸�ʡ�Ļ�����Ϣ
		 */
		String departmentAddress = request.getParameter("departmentAddress");
		String departmentPhone = request.getParameter("departmentPhone");
		String loginRealName = request.getParameter("loginRealName");
		if(departmentAddress==null || departmentAddress == ""){
			request.setAttribute("errorAddress", "��ַ����Ϊ��");
			return new ActionForward("/page/province/baseinfo_modify.jsp");
		}
		if(departmentPhone == null || departmentPhone == ""){
			request.setAttribute("errorPhone", "�绰����Ϊ��");
			return new ActionForward("/page/province/baseinfo_modify.jsp");
		}
		if(loginRealName == null || loginRealName == ""){
			request.setAttribute("errorName", "��ʵ��������Ϊ��");
			return new ActionForward("/page/province/baseinfo_modify.jsp");
		}
		int deparmentId = invokeResult.getResult().getId();// �õ����ŵ�id			//��invokeResult���������ȡdepartmentid	����2

		UpdataProvinceService updataProvince = new UpdataProvinceService();
		updataProvince.UpdataProvinceInfoServiceByDepartmentId(deparmentId,
				departmentAddress, departmentPhone,loginRealName,loginId);// ����departmentId����service����ķ���    �޸�department��
		return new ActionForward("/province/provinceShowBaseInfo.do");
	}

}
