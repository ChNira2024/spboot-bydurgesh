package com.nt.niranjana.constructorinjectionMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.constructorinjection.AmbiguityProblemCI;


/**
 * Hello world!
 *
 */
public class AmbiguityMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/constructorinjection/ambiguityProblemSolved.xml");
       //then pass our class id and get data from getBean()
       AmbiguityProblemCI ambDetails = (AmbiguityProblemCI) context.getBean("amb"); //first object
       System.out.println("ambDetails: "+ambDetails);
       ambDetails.doSum();
       
     
       
    }
}
