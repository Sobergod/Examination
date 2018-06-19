package com.luas.tms.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<E> {
	public E mapRow(ResultSet rs) throws SQLException;
}
