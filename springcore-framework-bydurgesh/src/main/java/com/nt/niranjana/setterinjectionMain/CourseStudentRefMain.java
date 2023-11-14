package com.nt.niranjana.setterinjectionMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.setterinjection.Course;

/**
 * Hello world!
 *
 */
public class CourseStudentRefMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/setterinjection/courseStudentConfig.xml");
       
       //then pass our class id and get data from getBean()
       Course courseStudentRef = (Course) context.getBean("coursestudentref"); //first object
       System.out.println("courseStudentRef: "+courseStudentRef);       
       System.out.println("Fetch java: "+courseStudentRef.getJava());
       System.out.println("Fetch python: "+courseStudentRef.getPython());     
       System.out.println("Fetch No: "+courseStudentRef.getStudent().getsNo());
       System.out.println("Fetch Name: "+courseStudentRef.getStudent().getsName());
       System.out.println("Fetch Address: "+courseStudentRef.getStudent().getsAddrs());
       System.out.println("Fetch Salary: "+courseStudentRef.getStudent().getsSal());
       
       Course courseStudentRef2 = (Course) context.getBean("coursestudentref2"); //second object
       System.out.println("courseStudentRef2: "+courseStudentRef2);    
       System.out.println("Fetch java: "+courseStudentRef2.getJava());
       System.out.println("Fetch python: "+courseStudentRef2.getPython());   
       System.out.println("Fetch No: "+courseStudentRef2.getStudent().getsNo());
       System.out.println("Fetch Name: "+courseStudentRef2.getStudent().getsName());
       System.out.println("Fetch Address: "+courseStudentRef2.getStudent().getsAddrs());
       System.out.println("Fetch Salary: "+courseStudentRef2.getStudent().getsSal());
       
       Course courseStudentRef3 = (Course) context.getBean("coursestudentref3"); //third object
       System.out.println("courseStudentRef3: "+courseStudentRef3);    
       System.out.println("Fetch java: "+courseStudentRef3.getJava());
       System.out.println("Fetch python: "+courseStudentRef3.getPython());   
       System.out.println("Fetch No: "+courseStudentRef3.getStudent().getsNo());
       System.out.println("Fetch Name: "+courseStudentRef3.getStudent().getsName());
       System.out.println("Fetch Address: "+courseStudentRef3.getStudent().getsAddrs());
       System.out.println("Fetch Salary: "+courseStudentRef3.getStudent().getsSal());
    }
}
