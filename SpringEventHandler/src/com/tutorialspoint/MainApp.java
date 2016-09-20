package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		ctx.start();
		HelloWorld obj = (HelloWorld) ctx.getBean("helloworld");
		obj.setMessage("Whup?");
		System.out.println(obj.getMessage());
		ctx.stop();
	}

}
