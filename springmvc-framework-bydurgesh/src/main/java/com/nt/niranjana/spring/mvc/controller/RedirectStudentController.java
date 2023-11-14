package com.nt.niranjana.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.nt.niranjana.spring.mvc.model.User;

@Controller
public class RedirectStudentController 
{
	@RequestMapping("/") 
	public String register()
   { 
		return "index";
   }
	@RequestMapping("/loginInto") 
	public String registerUserDetails()
   { 
		System.out.println("registerUserDetails method");
	   return "loginform"; 
   }
		
	
	@RequestMapping("/redirectURLString")
	public String reDirectMethoduString()
	{
		return "redirect:/insertStudentDetails";
	}
	
	//using redirect while return type is String
	@RequestMapping("/insertStudentDetails")
	public String registerStudentsDetailsAsStringReturn(Model model)
	{
		System.out.println("registerStudentsDetails controller");
		model.addAttribute("id",101);
		model.addAttribute("name","Niranjana");
		
		//List of data passing for course
		List<String> courseList = new ArrayList<String>();
		courseList.add("Java");
		courseList.add("Python");
		courseList.add("PHP");
		
		model.addAttribute("listOfCourse",courseList);
		
		//List of data passing for phoneNo
		List<String> phoneNo = new ArrayList<String>();
		phoneNo.add("9808161717");
		phoneNo.add("9134786561");
		model.addAttribute("listOfPhone",phoneNo);	
		return "studentDetails";	
	}	
	
	
//======================================================================
	@RequestMapping("/redirectURLRedirect")
	public String reDirectMethodRedirectView()
	{
		return "redirect:/redirectURLRedirectView";
	}
	
	//using redirect while return type is RedirectView
		@RequestMapping("/redirectURLRedirectView")
		public RedirectView registerStudentsDetailsAsReturnRedirectView(Model model)
		{
			System.out.println("registerStudentsDetails controller");
			model.addAttribute("id",101);
			model.addAttribute("name","Niranjana");
			
			//List of data passing for course
			List<String> courseList = new ArrayList<String>();
			courseList.add("Java");
			courseList.add("Python");
			courseList.add("PHP");
			
			model.addAttribute("listOfCourse",courseList);
			
			//List of data passing for phoneNo
			List<String> phoneNo = new ArrayList<String>();
			phoneNo.add("9808161717");
			phoneNo.add("9134786561");
			model.addAttribute("listOfPhone",phoneNo);	
			
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("insertStudentDetails");
			return redirectView;	
		}
//--------------------------------------------------------------------------	
	//using Model with User and @ModelAttribute(Create a User model with same property name as loginform.jsp label input 'name'
		@RequestMapping(path="/loginFormDataUsingModelWithUserAndModelAttributeWithSpringORMWithRedirect",method=RequestMethod.POST)
		public String handleFormusingModelWithUserAndModelAttribute(@ModelAttribute User user, Model model)
		{			
			System.out.println("Users: "+user);
			
			if(user.getUserNameData().isBlank() || user.getUserPasswordData().isBlank())
			{
				System.out.println("Field can't be empty");
				return "redirect:/loginInto";
			}
			//fetch "id","name","password" id from .jsp by using Both @ModelAttribute with Model and display the result in success3.jsp
			model.addAttribute("usersdata", user);
			return "success3";	
		}
}
