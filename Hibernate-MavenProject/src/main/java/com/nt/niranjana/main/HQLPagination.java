package com.nt.niranjana.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nt.niranjana.entity.Customer;

public class HQLPagination 
{
	public static void main(String[] args) 
	{
     SessionFactory factory = new Configuration().configure().buildSessionFactory();
     Session ses =  factory.openSession();
     
    Query  query =  ses.createQuery("from Customer"); 
    
    //implementing pagination using hibernate
    query.setFirstResult(0); //page starting with
    query.setMaxResults(5); //page size
    
    List<Customer> list = query.list();
    for(Customer cust:list)
    {
    	System.out.println(cust.getId()+" : "+cust.getName()+" : "+cust.getEmail()+" : "+cust.getGender());
    }
    
     ses.close();
     factory.close();
		
	}
}
