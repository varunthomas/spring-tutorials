package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) ctx.getBean("studentjdbctemplate");
		studentJDBCTemplate.create("Varun", 22);
		studentJDBCTemplate.create("JVP", 22);
		studentJDBCTemplate.create("Sahal", 10);
		Student student = studentJDBCTemplate.getStudent(3);
		System.out.println("ID: "+student.getId()+" Name: "+student.getName()+" Age: "+student.getAge());
		List<Student> students = studentJDBCTemplate.listStudent();
		for(Student st : students){
			System.out.println("ID: "+st.getId()+" Name: "+st.getName()+" Age: "+st.getAge());
		}
	}

}
