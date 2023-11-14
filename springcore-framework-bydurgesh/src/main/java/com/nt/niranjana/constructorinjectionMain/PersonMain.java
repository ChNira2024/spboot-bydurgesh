package com.nt.niranjana.constructorinjectionMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.constructorinjection.Person;


/**
 * Hello world!
 *
 */
public class PersonMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/constructorinjection/personConfig.xml");
       //then pass our class id and get data from getBean()
       Person personDetails = (Person) context.getBean("personData"); //first object
       System.out.println("personDetails: "+personDetails);
       
       Person personDetails2 = (Person) context.getBean("personData2"); //second object
       System.out.println("personDetails2: "+personDetails2);
       
       Person personDetails3 = (Person) context.getBean("personData3"); //third object
       System.out.println("personDetails3: "+personDetails3);
       
    }
}
