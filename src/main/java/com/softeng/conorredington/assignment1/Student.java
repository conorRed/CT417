package com.softeng.conorredington.assignment1;

import java.util.Date;

/*
 * @Author Conor Redington
 */
public class Student {
	private String name, id;
	private String dob;
	private int age;

	public Student(String name, int age, String dob, String id) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
	}

	public String getUserName() {
		return this.name + Integer.toString(this.age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
