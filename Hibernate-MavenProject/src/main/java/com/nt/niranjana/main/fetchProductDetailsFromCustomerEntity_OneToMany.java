//package com.nt.niranjana.main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.nt.niranjana.entity.Customer;
//
//public class fetchProductDetailsFromCustomerEntity_OneToMany 
//{
//	public static void main(String[] args) 
//	{
//		//SessionFactory factory = new Configuration().configure().buildSessionFactory(); //one line 
//		
//		//first create configuration class object 
//        Configuration configure = new Configuration();
//        configure.configure("hibernate.cfg.xml");
//        SessionFactory factory = configure.buildSessionFactory();
//        System.out.println("factory object: "+factory);
//        
//      
//       Session session = factory.openSession();
//       
//
//        //fetch PersonalInfo from Employee class through his id using hibernate get() method
//        Customer getCustomer= session.get(Customer.class,1);
//       System.out.println("Get Customer Name:"+ getCustomer.getName());
//        System.out.println("Fetch Product from customer using Get(): "+getCustomer.getProducts());
//        session.close();
//        factory.close();		
//	}
//}