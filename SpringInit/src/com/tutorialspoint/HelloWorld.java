package com.tutorialspoint;

public class HelloWorld {

	private String message;
	public void setMessage(String message){
		this.message = message;
	}
	public void getMessage(){
		System.out.println("Your message is: "+message);
	}
	public void init(){
		System.out.println("Initializing...");
	}
	public void destroy(){
		System.out.println("Destroying...");
	}
}
