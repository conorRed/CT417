package com.softeng.conorredington.assignment1;
/*
 * @Author Conor Redington
 */
public class Module {
	private Student[] students;
	private Course[] courses;
	private String name;
	
	public Module(String name, Course[] courses, Student[] students) {
		this.setStudents(students);
		this.setCourses(courses);
		this.setName(name);
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
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
