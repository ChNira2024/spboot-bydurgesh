package com.nt.niranjana.setterinjectionMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.setterinjection.Student;


/**
 * Hello world!
 *
 */
public class StudentMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/setterinjection/studentConfig.xml");
       //then pass our class id and get data from getBean()
       Student studentDetails = (Student) context.getBean("studentData"); //first object
       System.out.println("studentDetails: "+studentDetails);
       
       Student studentDetails2 = (Student) context.getBean("studentData2"); //second object
       System.out.println("studentDetails: "+studentDetails2);
       
       Student studentDetails3 = (Student) context.getBean("studentData3"); //third object
       System.out.println("studentDetails: "+studentDetails3);
       
    }
}
