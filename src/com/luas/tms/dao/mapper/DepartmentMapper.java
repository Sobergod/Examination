package com.luas.tms.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.luas.tms.entity.Department;
import com.luas.tms.helper.RowMapper;

public class DepartmentMapper implements RowMapper<Department>{

	public Department mapRow(ResultSet rs) throws SQLException {
		Department department = new Department();
		department.setId(rs.getInt("id"));
		department.setName(rs.getString("name"));
		department.setCode(rs.getString("code"));
		department.setAddress(rs.getString("address"));
		department.setPhone(rs.getString("phone"));
		department.setLevel(rs.getInt("level"));
		
		return department;
		
	}

}
