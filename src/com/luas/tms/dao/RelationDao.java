package com.luas.tms.dao;

import java.sql.SQLException;

import com.luas.tms.dao.mapper.RelationMapper;
import com.luas.tms.entity.Relation;
import com.luas.tms.helper.DbHelper;

/**
 * Relatioin�����ǹ�ϵ��
 * ������ֶηֱ���:
 *id
 *LoginId
 *DepartmentId
 *principal
 */
public class RelationDao {
	DbHelper<Relation> dbHelper = new DbHelper<Relation>();
	public Relation findOneRelationByLoginId(int id) throws SQLException {
		Relation relation = null;
		String sql = "select * from relation where loginId = ?";
		Object[] objs = new Object[]{id};
		relation = dbHelper.executeQueryForOne(sql, objs, new RelationMapper());
		return relation;
	}
}
