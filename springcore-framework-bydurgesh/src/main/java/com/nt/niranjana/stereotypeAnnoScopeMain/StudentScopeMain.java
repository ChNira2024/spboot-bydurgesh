package com.nt.niranjana.stereotypeAnnoScopeMain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.nt.niranjana.stereotypeAnnoScope.PredefinedMethodVariable;
import com.nt.niranjana.stereotypeAnnoScope.Student;
import com.nt.niranjana.stereotypeAnnoScope.Teacher;




/**
 * Hello world!
 *
 */
public class StudentScopeMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //here we configure, IOC with our configuration xml file
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/nt/niranjana/stereotypeAnnoScope/studentConfig.xml");
       //then pass our class id and get data from getBean()
      // Student studentDetails =  context.getBean("student",Student.class); //spring-container bydefault take bean Class as classId(in lower case) becoz of @Component Annotation
      // System.out.println("studentDetails: "+studentDetails);
       
       //1st way
		
		  Student studentDetails2 = context.getBean("studentManualId",Student.class);
		  //manually taking bean class ID
		  System.out.println("studentDetails2: "+studentDetails2);
		  
		  Student studentDetails3 = context.getBean("studentManualId",Student.class);
		  //manually taking bean class ID
		  System.out.println("studentDetails2: "+studentDetails3);
		  
		  System.out.println("studentDetails2: "+studentDetails2.hashCode());
		  System.out.println("studentDetails3: "+studentDetails3.hashCode());
		  if(studentDetails2.hashCode() == studentDetails3.hashCode()) 
		  {
		  System.out.println("Both objects are Same.."); 
		  } else {
		  System.out.println("Both are two different objects.."); 
		  }
		 
		 
 
       //2nd way
       Teacher teacher =  context.getBean("teacher",Teacher.class); 
       System.out.println("teacher: "+teacher);
       
       Teacher teacher2 =  context.getBean("teacher",Teacher.class); 
       System.out.println("teacher2: "+teacher2);
       
       System.out.println("teacher: "+teacher.hashCode());
       System.out.println("teacher: "+teacher2.hashCode());
       if(teacher.hashCode() == teacher2.hashCode())
       {
    	   System.out.println("Both teacher objects are Same..");
       }
       else {
    	   System.out.println("Both teacher are two different objects..");
       }
       
       SpelExpressionParser parser = new SpelExpressionParser();
      Expression express =   parser.parseExpression("20+10+30");
      System.out.println("express: "+express.getValue());
      
      PredefinedMethodVariable obj = context.getBean("pdmv",PredefinedMethodVariable.class);
      System.out.println("obj: "+obj);
    
    }
}
