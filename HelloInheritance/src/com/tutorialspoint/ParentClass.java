package com.tutorialspoint;

public class ParentClass {
	private String message1,message2;
	public void getMessage1(){
		System.out.println("Message 1 is: "+message1 );
	}
	public void getMessage2(){
		System.out.println("Message 2 is: "+message2 );
	}
	public void setMessage1(String message1){
		this.message1 = message1;
	}
	public void setMessage2(String message2){
		this.message2 = message2;
	}
}
