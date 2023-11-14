package com.nt.niranjana.stereotypeAnnoMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.stereotypeAnno.Student;



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
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/stereotypeAnno/studentConfig.xml");
       //then pass our class id and get data from getBean()
      // Student studentDetails =  context.getBean("student",Student.class); //spring-container bydefault take bean Class as classId(in lower case) becoz of @Component Annotation
      // System.out.println("studentDetails: "+studentDetails);
       
       Student studentDetails2 =  context.getBean("studentManualId",Student.class); //manually taking bean class ID
       System.out.println("studentDetails2: "+studentDetails2);
 
 
    }
}
