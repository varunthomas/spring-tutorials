package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int numRow) throws SQLException{
		Student st = new Student();
		st.setAge(rs.getInt("age"));
		st.setId(rs.getInt("id"));
		st.setName(rs.getString("name"));
		return st;
	}
}
