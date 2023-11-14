//package com.nt.niranjana.main;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Date;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.nt.niranjana.entity.Address;
//import com.nt.niranjana.entity.Student;
//
//public class InsertStudentsAndAddressDetails 
//{
//
//	public static void main(String[] args) throws IOException 
//	{
//		System.out.println( "Project Started!!!" );
//
//        //SessionFactory factory = new Configuration().configure().buildSessionFactory(); //one line
//        
//        //first create configuration class object
//        Configuration configure = new Configuration();
//        configure.configure("hibernate.cfg.xml");
//        SessionFactory factory = configure.buildSessionFactory();//After cfg, here we get session object of SessionFactory Impl class
//        System.out.println("factory object: "+factory);//using this object we can fetch the data
//        System.out.println(factory.isClosed());
//        
//        //create Student object
//        Student st = new Student();
//        st.setId(105);
//        st.setName("ShahRukhKhan");
//        st.setCity("Mumbai");
//        System.out.println(st);
//        
//      //create Student-Address object
//        Address address = new Address();
//        address.setStreet("Bandra");
//        address.setCity("Mumbai");
//        address.setCityIsOpen(true);
//        address.setDob(new Date());        
//        address.setAccountBalance(30000.292);  //ignored filed using @Transient..so value doesn't stored in db
//        
//        //Reading image and store in DB
//        FileInputStream fis = new FileInputStream("src/main/java/ShahRukhKhan.jpg");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        address.setImage(data);
//        System.out.println(address);
//        
//        //After creating student class object we need to save it. For saving, we have to use "save" method of Session interface.But session data is present in SessionFactory.
//        //so we use factory.openSession() method for getting current session. using current session transaction start then save operation happens.
//        Session session = factory.openSession();
//        Transaction tx =  session.beginTransaction();//this is required when we need to save data in db(//to store data in db permanently)
//        session.save(st);    //using this method student data stored in database 101781642204   Nira@#$923
//        session.save(address);   ////using this method student-address data stored in database
//        tx.commit();
//        session.close();  
//	}
//
//}
