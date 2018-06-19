package com.luas.tms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.luas.tms.entity.Department;
import com.luas.tms.entity.Login;
import com.luas.tms.entity.Relation;
import com.luas.tms.helper.RowMapper;

public class RelationMapper implements RowMapper<Relation> {

	public Relation mapRow(ResultSet rs) throws SQLException {
		Relation relation = new Relation();
		relation.setId(rs.getInt("id"));
		relation.setPrincipal(rs.getString("principal"));
		
		Login login = new Login();
		login.setId(rs.getInt("loginId"));
		relation.setLogin(login);
		
		Department department = new Department();
		department.setId(rs.getInt("departmentId"));
		relation.setDepartment(department);
		return relation;
	}

}
