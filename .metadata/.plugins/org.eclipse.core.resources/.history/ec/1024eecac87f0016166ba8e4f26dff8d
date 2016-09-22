package com.tutorialspoint;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;
public class StudentJDBCTemplate implements StudentDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void create(String name, int age){
		String SQL = "insert into student(name,age) values(?,?)";
		jdbcTemplate.update(SQL,name,age);
	}
	public Student getStudent(int id){
		String SQL = "select * from student where id=?";
		Student student = jdbcTemplate.queryForObject(SQL, new Object[]{id}, new StudentMapper());
		return student;
	}
	public List<Student> listStudent(){
		String SQL="select * from student";
		List<Student> students = jdbcTemplate.query(SQL,new StudentMapper());
		return students;
	}
	public void update(int id, int age){
		String SQL="update student set age=? where id=?";
		jdbcTemplate.update(SQL, age,id);
	}
	public void delete(int id){
		String SQL="delete from student where id=?";
		jdbcTemplate.update(SQL,id);
	}
}
