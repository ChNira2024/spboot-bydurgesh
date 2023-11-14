package com.nt.niranjana.lifecycleMain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.lifecycle.Pepsi;

public class PepsiMain 
{
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        //here we configure, IOC with our configuration xml file
	       AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/lifecycle/pepsiConfig.xml");
	       //then pass our class id and get data from getBean()
	       Pepsi pepsiDetails = (Pepsi) context.getBean("pepsiId"); //first object
	       System.out.println("pepsiDetails: "+pepsiDetails);
	       context.registerShutdownHook();//it will call destroy() method
	    }
}
