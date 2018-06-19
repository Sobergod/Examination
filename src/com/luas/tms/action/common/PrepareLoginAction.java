package com.luas.tms.action.common;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.luas.tms.entity.UserType;
import com.luas.tms.mvc.Action;
import com.luas.tms.mvc.ActionForward;
import com.luas.tms.serivce.common.UserTypeService;
import com.luas.tms.util.InvokeResult;

public class PrepareLoginAction implements Action {

	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		UserTypeService userTypeService = new UserTypeService();
		InvokeResult<ArrayList<UserType>> invokeResult = userTypeService.findAllUserType();
		if(invokeResult.isSuccess()){
			ArrayList<UserType> userTypeList = invokeResult.getResult();//�õ��û����Ͷ���
			String jsonStr = JSONArray.fromObject(userTypeList).toString();
			System.out.println(jsonStr);
			out.write(jsonStr);
			
			out.flush();
			out.close();
		}else{
			//�������Ĵ���ҳ��ȥ����Ȼû������
		}
		
		ActionForward actionForward = new ActionForward();
		actionForward.setAjax(true);
		return actionForward;
		
	}

}
