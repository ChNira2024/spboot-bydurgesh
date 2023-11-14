//package com.nt.niranjana.main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.nt.niranjana.entity.Address;
//import com.nt.niranjana.entity.Student;
//
//public class FetchStudentsAndAddressDetails 
//{
//	public static void main(String[] args) 
//	{
//		//SessionFactory factory = new Configuration().configure().buildSessionFactory(); //one line 
//		
//		//first create configuration class object
//        Configuration configure = new Configuration();
//        configure.configure("hibernate.cfg.xml");
//        SessionFactory factory = configure.buildSessionFactory();//After cfg, here we get session object of SessionFactory Impl class
//        System.out.println("factory object: "+factory);//using this object we can fetch the data
//        
//        Session session = factory.openSession();
//        
//        //fetch student details through his id using hibernate get() method
//        Student getStudent= session.get(Student.class,105);
//        System.out.println("Fetch Students Details using Get(): "+getStudent);
//        
//        //fetch student details through his id using hibernate load() method
//        Student loadStudent= session.load(Student.class,104);
//        System.out.println("Fetch Students Details using load(): "+loadStudent);
//        
//        //fetch student-address details through his addressId using hibernate get() method
//        Address getStudentAddress = session.get(Address.class,1);
//        System.out.println("Fetch Students-Address city using Get(): "+getStudentAddress.getCity());
//        
//        //fetch student details through his addressId using hibernate load() method
//        Address loadStudentAddress = session.load(Address.class,2);
//        System.out.println("Fetch Students-Address city using load(): "+loadStudentAddress.getCity());
//        
//        session.close();
//        factory.close();		
//	}
//}
////get() return null,if it couldn't found the object data from cache/Database.
////get() method first get the object data from Session cache, if not found then get the data from DB
////we use get() method if we are not sure that object data is there/exist or not
//
////load() throws ObjectNotFoundException, if it couldn't found the object data from cache/Database But never return null
//           //org.hibernate.ObjectNotFoundException: No row with the given identifier exists: [com.nt.niranjana.entity.Student#1049]
////we use load() method when we are sure that object data is present/exist