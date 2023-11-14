package com.nt.niranjana.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.niranjana.entity.Certificate;
import com.nt.niranjana.entity.Student;


public class HibernateStateFlow
{
	public static void main(String[] args) 
	{
		System.out.println("HibernateStateFlow.main()");
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Create Student object
		Student student = new Student();
		student.setName("Jagannath Mahaprabhu");
		student.setCity("Puri Dham");
		
		//Create Certificate object for Student class
		Certificate certificate = new Certificate();
		certificate.setCourse("Spring");
		certificate.setDuration("1 Year");
		
		student.setCertificate(certificate);
		
		Session session = factory.openSession();
	   Transaction tx 	= session.beginTransaction();
	   session.save(student);
		tx.commit();
		factory.close();
		
		
	}

}
