package com.nt.niranjana.stereotypeAnno.confgcscanbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigCompScanBeanMain {

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("getStudent",Student.class);
		System.out.println("student: "+student);
		student.study();
	
	}

}
