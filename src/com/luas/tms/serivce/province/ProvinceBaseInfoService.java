package com.luas.tms.serivce.province;

import java.sql.SQLException;

import com.luas.tms.dao.DepartmentDao;
import com.luas.tms.dao.RelationDao;
import com.luas.tms.entity.Department;
import com.luas.tms.entity.Relation;
import com.luas.tms.helper.DbHelper;
import com.luas.tms.util.InvokeResult;

public class ProvinceBaseInfoService {
	private RelationDao relationDao = new RelationDao();
	private DepartmentDao departmentDao = new DepartmentDao();
	
	/**
	 * �÷���ͨ����ӳ��LoginId����һ�����ŵ���Ϣ
	 * @param id
	 * @return
	 */
	public InvokeResult<Department> findOneDepartmentByLoginId(int id) {
		try {
			//Relation�������װ��Login��   Department����
			/**
			 * ��ͨ��loginId�ҵ�һ��Relation
			 * Ȼ��Relation���departmentId�õ�
			 */
			Relation relation = relationDao.findOneRelationByLoginId(id);
			Department department = departmentDao.findOneDepartmentById(relation.getDepartment().getId());
			if(department != null){
				return new InvokeResult<Department>(department);
			}else{
				return new InvokeResult<Department>("û���ҵ���Ӧ�Ĳ��ţ�");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return new InvokeResult<Department>("��ѯ����ʱ���ݿ�������⣡");
		}finally{
			try {
				DbHelper.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
