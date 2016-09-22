package com.tutorialspoint;

import javax.sql.DataSource;
import java.util.List;
public interface StudentDAO {

	public void setDataSource(DataSource dataSource);
	public void create(String name, int age);
	public void update(int id, int age);
	public Student getStudent(int id);
	public List<Student> listStudent();
	public void delete(int id);
}
