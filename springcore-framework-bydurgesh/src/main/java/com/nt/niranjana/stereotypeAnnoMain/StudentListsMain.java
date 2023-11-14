package com.nt.niranjana.stereotypeAnnoMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.stereotypeAnno.StudentsList;



/**
 * Hello world!
 *
 */
public class StudentListsMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/stereotypeAnno/studentListConfig.xml");
       
       //then pass our class id and get data from getBean()
       StudentsList studentDetailsList =context.getBean("objList",StudentsList.class); //first object
       System.out.println("studentDetailsList: "+studentDetailsList);
       
       System.out.println("Fetch Name: "+studentDetailsList.getName());
       System.out.println("Fetch PhoneNo: "+studentDetailsList.getPhoneno().getClass().getName());
       System.out.println("Fetch Address: "+studentDetailsList.getAddress().getClass().getName());
       System.out.println("Fetch DBConfig: "+studentDetailsList.getDbConfiguration().getClass().getName());
       System.out.println("Fetch Course: "+studentDetailsList.getCourse().getClass().getName());

       StudentsList studentDetailsList2 =context.getBean("objList",StudentsList.class); //second object
       System.out.println(studentDetailsList2.hashCode());
       System.out.println(studentDetailsList.hashCode());
       if(studentDetailsList.hashCode()==studentDetailsList2.hashCode())
       {
    	   System.out.println("lo");
       }else {
    	   System.out.println("not sameS");
       }
    }
}
