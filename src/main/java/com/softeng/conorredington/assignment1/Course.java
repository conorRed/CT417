package com.softeng.conorredington.assignment1;

import org.joda.time.DateTime;

/*
 * @Author Conor Redington
 */
public class Course {
	private String name;
	private Module[] modules;
	private Student[] students;
	private DateTime startDate, endDate;
	
	public Course(String name, Module[] modules, Student[] students, DateTime start, DateTime end) {
		this.name = name;
		this.modules = modules;
		this.students = students;
		this.startDate = start;
		this.endDate = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Module[] getModules() {
		return modules;
	}

	public void setModules(Module[] modules) {
		this.modules = modules;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

}
