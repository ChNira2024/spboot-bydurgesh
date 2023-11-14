package com.nt.niranjana.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.niranjana.entity.Employee2;
import com.nt.niranjana.entity.Projects;

public class InsertFetchProjectFromEmployee2Entity_ManyTomany
{
	public static void main(String[] args) 
	{
		//SessionFactory factory = new Configuration().configure().buildSessionFactory(); //one line 
		
		//first create configuration class object 
        Configuration configure = new Configuration();
        configure.configure("hibernate.cfg.xml");
        SessionFactory factory = configure.buildSessionFactory();
        System.out.println("factory object: "+factory);
        
      //create Employee object
      Employee2 emp1 = new Employee2();
      emp1.setEmpName("Kalia");
      emp1.setBloodGroup("A+ve");
      
      Employee2 emp2 = new Employee2();
      emp2.setEmpName("Balia");
      emp2.setBloodGroup("A-ve");
      
      //create Project class object
      Projects project1 = new Projects();
      project1.setProjectsName("Mashreq-OA");
      
      Projects project2 = new Projects();
      project2.setProjectsName("Mashreq-AML");
      
      
      List<Employee2> listOfEmployee = new ArrayList<Employee2>();
      listOfEmployee.add(emp1);
      listOfEmployee.add(emp2);
      
      List<Projects> listOfProject = new ArrayList<Projects>();
      listOfProject.add(project1);//OA project
      listOfProject.add(project2);//AML project
      
      emp1.setProject(listOfProject);  //emp1 assigned by 2 project
      project1.setEmployees(listOfEmployee);  //total 2 project of project1 assigned to 2 employee
      
      
      System.out.println("emp1: "+emp1);
      System.out.println("project1: "+project1);
      
       Session session = factory.openSession();
       Transaction tx =  session.beginTransaction();
       
       //session.save(emp1);  //session.save() method is a deprecated, so use persist() method
       session.persist(emp1);
       session.persist(emp2);
       session.persist(project1);
       session.persist(project2);
       tx.commit();
        
        //fetch PersonalInfo from Employee class through his id using hibernate get() method
       // Employee getEmployee= session.get(Employee.class,1);
     //  System.out.println("Get Employee ID:"+ getEmployee.getEmpName());
      //  System.out.println("Fetch PersonalInfo from Employe using Get(): "+getEmployee.getPersonalInfo().getVoteCardNumber());
        session.close();
        factory.close();		
	}
}