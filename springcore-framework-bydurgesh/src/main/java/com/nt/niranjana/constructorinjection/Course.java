package com.nt.niranjana.constructorinjection;


public class Course 
{
	private String java;
	private String python;
	
	private Person person;

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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Course(String java, String python, Person person) {
		super();
		this.java = java;
		this.python = python;
		this.person = person;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [java=" + java + ", python=" + python + ", person=" + person + "]";
	}

	

}
