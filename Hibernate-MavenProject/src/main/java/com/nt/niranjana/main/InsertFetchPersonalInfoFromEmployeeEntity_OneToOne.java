//package com.nt.niranjana.main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.nt.niranjana.entity.Employee;
//import com.nt.niranjana.entity.PersonalInfo;
//
//public class InsertFetchPersonalInfoFromEmployeeEntity_OneToOne
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
//      //create Employee object
//      Employee emp = new Employee();
//      emp.setEmpName("Raju");
//      emp.setBloodGroup("B+ve");
//      
//      //create PersonalInfo class object
//      PersonalInfo personalInfo = new PersonalInfo();
//      personalInfo.setPanCardNumber("CDBG2727BN");
//      personalInfo.setVoteCardNumber("AS120393BNF");
//      personalInfo.setEmployee(emp);
//      
//      emp.setPersonalInfo(personalInfo);
//      
//      System.out.println("emp: "+emp);
//      System.out.println("personalInfo: "+personalInfo);
//      
//       Session session = factory.openSession();
//       Transaction tx =  session.beginTransaction();
//       
//       //session.save(emp);  //session.save() method is a deprecated, so use persist() method
//       session.persist(emp);
//       session.persist(personalInfo);
//       tx.commit();
//        
//        //fetch PersonalInfo from Employee class through his id using hibernate get() method
//        Employee getEmployee= session.get(Employee.class,1);
//       System.out.println("Get Employee ID:"+ getEmployee.getEmpName());
//        System.out.println("Fetch PersonalInfo from Employe using Get(): "+getEmployee.getPersonalInfo().getVoteCardNumber());
//        session.close();
//        factory.close();		
//	}
//}