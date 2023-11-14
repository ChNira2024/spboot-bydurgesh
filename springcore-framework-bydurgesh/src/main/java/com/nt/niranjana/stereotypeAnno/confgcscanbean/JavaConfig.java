package com.nt.niranjana.stereotypeAnno.confgcscanbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
	@Bean
	public Course getCourse()
	{
		return new Course();
	}
	
	@Bean
	public Student getStudent()
	{
		Student student = new Student(getCourse());
		return student;
	}

}
