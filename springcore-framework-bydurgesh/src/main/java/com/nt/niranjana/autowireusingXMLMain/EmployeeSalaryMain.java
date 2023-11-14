package com.nt.niranjana.autowireusingXMLMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.autowireusingXML.Employee;


/**
 * Hello world!
 *
 */
public class EmployeeSalaryMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/autowireusingXML/empSalAutoConfig.xml");
       //then pass our class id and get data from getBean()
      // Employee empDetails = (Employee) context.getBean("empId"); //first object
       	//Employee empDetails = context.getBean("empId",Employee.class); //it also work
      // System.out.println("empDetails: "+empDetails);
       
       Employee empDetails2 = (Employee) context.getBean("empId2"); //second object
       System.out.println("empDetails2: "+empDetails2);
    }
}
