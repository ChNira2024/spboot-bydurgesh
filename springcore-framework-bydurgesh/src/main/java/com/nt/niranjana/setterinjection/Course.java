package com.nt.niranjana.setterinjection;


public class Course 
{
	private String java;
	private String python;
	
	private Student student;

	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getPython() {
		return python;
	}

	public void setPython(String python) {
		this.python = python;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course(String java, String python, Student student) {
		super();
		this.java = java;
		this.python = python;
		this.student = student;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [java=" + java + ", python=" + python + ", student=" + student + "]";
	}
	
	

}
