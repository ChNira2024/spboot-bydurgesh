package com.nt.niranjana.constructorinjectionMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.constructorinjection.Course;


/**
 * Hello world!
 *
 */
public class CoursePersonRefMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/constructorinjection/coursePersonConfig.xml");
       
       //then pass our class id and get data from getBean()
       Course courseStudentRef = (Course) context.getBean("coursepersonref"); //first object
       System.out.println("courseStudentRef: "+courseStudentRef);       
       System.out.println("Fetch java: "+courseStudentRef.getJava());
       System.out.println("Fetch python: "+courseStudentRef.getPython());     
       System.out.println("Fetch No: "+courseStudentRef.getPerson().getsNo());
       System.out.println("Fetch Name: "+courseStudentRef.getPerson().getsName());
       System.out.println("Fetch Address: "+courseStudentRef.getPerson().getsAddrs());
       System.out.println("Fetch Salary: "+courseStudentRef.getPerson().getsSal());
       
       Course courseCourseRef2 = (Course) context.getBean("coursepersonref2"); //second object
       System.out.println("courseCourseRef2: "+courseCourseRef2);    
       System.out.println("Fetch java: "+courseCourseRef2.getJava());
       System.out.println("Fetch python: "+courseCourseRef2.getPython());   
       System.out.println("Fetch No: "+courseCourseRef2.getPerson().getsNo());
       System.out.println("Fetch Name: "+courseCourseRef2.getPerson().getsName());
       System.out.println("Fetch Address: "+courseCourseRef2.getPerson().getsAddrs());
       System.out.println("Fetch Salary: "+courseCourseRef2.getPerson().getsSal());
       
       Course coursePersonRef3 = (Course) context.getBean("coursepersonref3"); //third object
       System.out.println("coursePersonRef3: "+coursePersonRef3);    
       System.out.println("Fetch java: "+coursePersonRef3.getJava());
       System.out.println("Fetch python: "+coursePersonRef3.getPython());   
       System.out.println("Fetch No: "+coursePersonRef3.getPerson().getsNo());
       System.out.println("Fetch Name: "+coursePersonRef3.getPerson().getsName());
       System.out.println("Fetch Address: "+coursePersonRef3.getPerson().getsAddrs());
       System.out.println("Fetch Salary: "+coursePersonRef3.getPerson().getsSal());
    }
}
