package com.nt.niranjana.stereotypeAnno.confgcscanbean;

public class Student 
{
	private Course course;
	
	
	
	public Course getCourse() {
		return course;
	}



	public Student(Course course) {
		super();
		this.course = course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public void study()
	{
		course.java();
		System.out.println("Student is learning Java");
	}

}
