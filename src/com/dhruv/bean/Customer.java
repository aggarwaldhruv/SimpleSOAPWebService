package com.dhruv.bean;

/**
 * @author Dhruv
 * Bean Class for Customer 
 */
public class Customer {
	private int Id;
	private String name;
	private int age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
