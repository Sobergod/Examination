package com.luas.tms.serivce.teacher;

import java.util.List;

import com.luas.tms.action.teacher.InfoBean;
import com.luas.tms.dao.TeacherDao1;
import com.luas.tms.util.InvokeResult;

public class AddluruSerivce {
	private TeacherDao1 teac=new TeacherDao1();
	public InvokeResult<InfoBean> findOneDepartmentByLoginId(int loginId,
			int logname) {
	try {
		List<InfoBean> info=teac.findteacher(loginId,logname);
		System.out.println(info.get(0).getZkId());
	} catch (Exception  e) {
		e.printStackTrace();
		return new InvokeResult<InfoBean>("��ѯ����ʱ���ݿ�������⣡");
	}	
		
		return null;
	}
//	private RelationDao relationDao = new RelationDao();
//	private DepartmentDao departmentDao = new DepartmentDao();
//	private TeacherDao1 teacher=new TeacherDao1();
//	public InvokeResult<Department> findOneDepartmentByLoginId(int loginId, int realname) {
//		try {
//			//Relation�������װ��Login��   Department����
//			/**
//			 * ��ͨ��loginId�ҵ�һ��Relation
//			 * Ȼ��Relation���departmentId�õ�
//			 */
//			//Relation relation = relationDao.findOneRelationByLoginId(loginId);
//			InfoBean info = teacher.findteacher(realname,l);
//			//Department department = departmentDao.findOneDepartmentById(relation.getDepartment().getId());
////			if(department != null){
////				return new InvokeResult<Department>(department);
////			}else{
////				return new InvokeResult<Department>("û���ҵ���Ӧ�Ĳ��ţ�");
////			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return new InvokeResult<Department>("��ѯ����ʱ���ݿ�������⣡");
//		}finally{
//			try {
//				DbHelper.closeConnection();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}


	

}
