//package com.nt.niranjana.main;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.nt.niranjana.entity.Customer;
//import com.nt.niranjana.entity.Product;
//
//public class InsertProductDetailsFromCustomerEntity_OneToMany 
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
//      //create Customer object
//        Customer cu = new Customer();
//      cu.setEmail("nira@gmail.com");
//      cu.setGender("Male");
//      cu.setName("nira");
//      
//      
//      //create Product class object
//      Product pro = new Product();
//      pro.setPrice("12000");
//      pro.setProductName("Mobile");
//      pro.setQty("1");
//      
//      Product pro2 = new Product();
//      pro2.setPrice("65000");
//      pro2.setProductName("Laptop");
//      pro2.setQty("2");
//
//      List<Product> list = new ArrayList<Product>();
//      list.add(pro2);     
//      cu.setProducts(list);
//      
//       Session session = factory.openSession();
//       Transaction tx =  session.beginTransaction();
//       
//       //session.save(cu);  //session.save() method is a deprecated, so use persist() method
//       session.persist(cu);
//       session.persist(pro);
//       session.persist(pro2);
//       tx.commit();
//       
//        session.close();
//        factory.close();		
//	}
//}