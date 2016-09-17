package com.tutorialspoint;

import java.util.*;

public class JavaCollections {

	private List list;
	private Set set;
	private Properties properties;
	private Map map;
	
	public void setList(List list){
		this.list = list;
	}
	public void setSet(Set set){
		this.set = set;
	}
	public void setProperties(Properties properties){
		this.properties = properties;
	}
	public void setMap(Map map){
		this.map = map;
	}
	public void getList(){
		System.out.println("List are: " + list);
	}
	public void getSet(){
		System.out.println("Set are: " + set);
	}
	public void getProperties(){
		System.out.println("Properties are: " + properties);
	}
	public void getMap(){
		System.out.println("Map are: " + map);
	}
	
}
