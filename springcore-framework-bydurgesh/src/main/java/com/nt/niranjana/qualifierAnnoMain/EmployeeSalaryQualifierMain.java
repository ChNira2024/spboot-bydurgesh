package com.nt.niranjana.qualifierAnnoMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.qualifierAnno.Employee;




/**
 * Hello world!
 *
 */
public class EmployeeSalaryQualifierMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/qualifierAnno/empSalQualifierConfig.xml");
       //then pass our class id and get data from getBean()
      // Employee empDetails = (Employee) context.getBean("empId"); //first object
       	Employee empDetails = context.getBean("empId4",Employee.class); //it also work
       System.out.println("empDetails: "+empDetails);
       
    }
}
