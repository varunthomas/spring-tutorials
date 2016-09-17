package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
		obj1.setMessage("aliyo");
		obj1.getMessage();
		HelloWorld obj2 = (HelloWorld) context.getBean("helloworld");
		obj2.setMessage("aliyo");
		obj2.getMessage();
		context.registerShutdownHook();
	}
}
