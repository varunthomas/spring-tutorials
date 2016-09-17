package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ParentClass obj = (ParentClass) context.getBean("parent");
		obj.getMessage1();
		obj.getMessage2();
		ChildClass obj2 = (ChildClass) context.getBean("child");
		obj2.getMessage1();
		obj2.getMessage2();
		obj2.getMessage3();
		
	}

}
