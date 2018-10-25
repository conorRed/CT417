package com.softeng.conorredington.assignment1;

import java.util.ArrayList;

/*
 * @Author Conor Redington
 */
public class Module {
	private ArrayList<Student> students;
	private Course[] courses;
	private String name;
	
	public Module(String name, ArrayList<Student> students) {
		this.setStudents(students);
		this.setName(name);
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students2) {
		this.students = students2;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
