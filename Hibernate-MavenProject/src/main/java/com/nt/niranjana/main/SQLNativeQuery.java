package com.nt.niranjana.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLNativeQuery 
{
	public static void main(String[] args) 
	{
     SessionFactory factory = new Configuration().configure().buildSessionFactory();
     Session session = factory.openSession();
     
     //SQL query
     String query = "select *from hbn_customer"; //DB table name
    NativeQuery nq = session.createNativeQuery(query);
    List<Object[]> list =    nq.list();
    for(Object[] customer : list)
    {
    	//System.out.println(Arrays.deepToString(customer)); //get total data
    	System.out.println(customer[2]+" : "+customer[3]);
    }
     
     session.close();
     factory.close();
		
	}

}
