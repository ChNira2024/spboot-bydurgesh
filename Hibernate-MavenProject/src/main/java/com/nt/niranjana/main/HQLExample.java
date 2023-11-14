package com.nt.niranjana.main;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class HQLExample 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		/*
		//HQL syntax
		System.out.println("--------select query-----------");
		//String query = "from Student"; //here Student is a Entity name not table name.
		//String query = "from Student where city=:x";
		String selectQuery = "from Student as s where s.city=:x and s.name=:y";  //get details through alias name
		
		 //Query q = session.createQuery(query);//The session.createQuery method is deprecated in Hibernate 5
		 Query q = (Query) session.getEntityManagerFactory().createEntityManager().createQuery(selectQuery);
		 q.setParameter("x","Chatrapur");
		 q.setParameter("y", "Sisu");
		 
		//get multiple data
		 List<Student> list = q.list();
		 for(Student student : list)
		 {
			 //System.out.println(student.getName()+" : "+student.getCertificate());
			 System.out.println(student.getName()+" : "+student.getCity());
		 }
		 */
		 /*
		System.out.println("--------delete query-----------");
		String deleteQuery = "delete from Student s where s.city=:h";  //delete details through alias name
		Transaction tx = session.beginTransaction();		
		Query q2 =  session.createQuery(deleteQuery);
		q2.setParameter("h","Mumbai");
		int r = q2.executeUpdate();
		System.out.println("deleted");
		*/
		
		 /*
		System.out.println("--------update query-----------");
		String updateQuery = "update Student set city=:t where name=:n";  //delete details through alias name
		Transaction tx1 = session.beginTransaction();		
		Query q3 =  session.createQuery(updateQuery);
		q3.setParameter("t","Hyd");
		q3.setParameter("n", "Sisu");
		int no = q3.executeUpdate();
		System.out.println("data updated");
		*/
		 
		 System.out.println("--------execute Join query-----------");
		String joinQuery = "select c.name,c.email,c.gender,p.productName,p.price from Customer as c INNER JOIN c.products as p"; 
		Transaction tx1 = session.beginTransaction();		
		Query q4 =  session.createQuery(joinQuery);
		List<Object[]> list3 = q4.getResultList();
		for(Object[] arr : list3)
		{
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("two table data joined");
		
		tx1.commit();
		session.close();
		factory.close();
	}

}
