package com.nt.niranjana.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.niranjana.entity.Certificate;
import com.nt.niranjana.entity.Student;



public class InsertStudentCertificateUsingEmbeddableConcept 
{
	public static void main(String[] args) 
	{
		System.out.println( "Project Started!!!" );

        //SessionFactory factory = new Configuration().configure().buildSessionFactory(); //one line
        
        //first create configuration class object
        Configuration configure = new Configuration();
        configure.configure("hibernate.cfg.xml");
        SessionFactory factory = configure.buildSessionFactory();//After cfg, here we get session object of SessionFactory Impl class
        System.out.println("factory object: "+factory);//using this object we can fetch the data
        System.out.println(factory.isClosed());
        
        //create Student object
        Student st = new Student();
        st.setId(204);
        st.setName("Sisu");
        st.setCity("Chatrapur");
        
        //create Certificate object
        //st.setCertificate(new Certificate("Java Certificate","1 Year"));  //one line object create 
        
	    Certificate certificate = new Certificate();
	    certificate.setCourse("Java Certificate");
	    certificate.setDuration("1 Year");
	    
	    st.setCertificate(certificate);  //use certificate object data in Student class
	    
	    Session session = factory.openSession();
	    Transaction tx = session.beginTransaction();
	    session.save(st);
	    tx.commit();
	    session.close();
	    factory.close();   
	}
}
