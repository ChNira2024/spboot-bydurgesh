package com.nt.niranjana.lifecycleMain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.niranjana.lifecycle.Food;

public class FoodMain 
{
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        //here we configure, IOC with our configuration xml file
	       AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/lifecycle/foodConfig.xml");
	       //then pass our class id and get data from getBean()
	       Food foodDetails = (Food) context.getBean("foodId"); //first object
	       System.out.println("foodDetails: "+foodDetails);
	       context.registerShutdownHook();//it will call destroy() method
	    }
}
