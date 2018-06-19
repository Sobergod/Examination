package com.luas.tms.serivce.school;

import java.sql.SQLException;

import com.luas.tms.dao.DepartmentDao;
import com.luas.tms.dao.RelationDao;
import com.luas.tms.entity.Department;
import com.luas.tms.entity.Relation;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.util.InvokeResult;

public class SchoolBaseInfoSerivce {
	private RelationDao relationDao = new RelationDao();
	private DepartmentDao departmentDao = new DepartmentDao();
	public InvokeResult<Department> findOneDepartmentByLoginId(int loginId) {
		try {
			//Relation表里面封装了Login象   Department对象
			/**
			 * 先通过loginId找到一个Relation
			 * 然后将Relation里的departmentId得到
			 */
			Relation relation = relationDao.findOneRelationByLoginId(loginId);
			Department department = departmentDao.findOneDepartmentById(relation.getDepartment().getId());
			if(department != null){
				return new InvokeResult<Department>(department);
			}else{
				return new InvokeResult<Department>("没有找到相应的部门！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return new InvokeResult<Department>("查询部门时数据库出现问题！");
		}finally{
			try {
				DbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
