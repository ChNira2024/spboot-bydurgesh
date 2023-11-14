package com.nt.niranjana.lifecycleMain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.lifecycle.Samosa;

public class SamosaMain 
{
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        //here we configure, IOC with our configuration xml file
	       AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/lifecycle/samosaConfig.xml");
	       //then pass our class id and get data from getBean()
	       Samosa samosaDetails = (Samosa) context.getBean("samosaId"); //first object
	       System.out.println("samosaDetails: "+samosaDetails);
	       context.registerShutdownHook();//this method is require for call destroy method
	       
	       Samosa samosaDetails2 = (Samosa) context.getBean("samosaId2"); //second object
	       System.out.println("samosaDetails2: "+samosaDetails2);
	       context.registerShutdownHook();
	       
	       Samosa samosaDetails3 = (Samosa) context.getBean("samosaId3"); //third object
	       System.out.println("samosaDetails3: "+samosaDetails3);
	       context.registerShutdownHook();
	    }
}
