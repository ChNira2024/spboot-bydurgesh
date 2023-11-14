package com.nt.niranjana.standalonecollectionMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.standalonecollection.StudentsList;



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
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/standalonecollection/studentListConfig.xml");
       
       //then pass our class id and get data from getBean()
       StudentsList studentDetailsList = (StudentsList) context.getBean("studentslist"); //first object
       System.out.println("studentDetailsList: "+studentDetailsList);
       System.out.println();
       
       System.out.println("Fetch Name: "+studentDetailsList.getName());
       System.out.println();
       
       System.out.println("Fetch PhoneNo: "+studentDetailsList.getPhoneno());
       System.out.println("Fetch PhoneNo: "+studentDetailsList.getPhoneno().getClass().getName());
       System.out.println();
       
       System.out.println("Fetch Course: "+studentDetailsList.getCourse());
       System.out.println("Fetch Course: "+studentDetailsList.getCourse().getClass().getName());
       System.out.println();
       
       System.out.println("Fetch Address: "+studentDetailsList.getAddress());
       System.out.println("Fetch Address: "+studentDetailsList.getAddress().getClass().getName());
       System.out.println();
       
       System.out.println("Fetch DBConfig: "+studentDetailsList.getDbConfiguration());
       System.out.println("Fetch DBConfig: "+studentDetailsList.getDbConfiguration().getClass().getName());
    
       
    }
}
