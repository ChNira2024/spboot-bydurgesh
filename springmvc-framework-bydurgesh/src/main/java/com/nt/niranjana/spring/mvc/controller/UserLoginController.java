package com.nt.niranjana.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.niranjana.spring.mvc.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserLoginController 
{
	
	/*
	@RequestMapping("/login")
	public String registerUserDetails(Model m)
	{	
		m.addAttribute("Header", "Registration Form");
		return "loginform";	
	}
	*/
	
	//auto-load
	@ModelAttribute
	public void registerUserDetails(Model m)
	{	
		m.addAttribute("Header", "Registration Form"); //USED THIS IN loginform.jsp
		System.out.println("Auto-loading @ModelAttribute before handler");	
	}
	
	@RequestMapping("/login") 
	public String registerUserDetails()
   { 
		System.out.println("registerUserDetails method");
	   return "loginform"; 
   }
	
	//using request.getParameter("")
	@RequestMapping(path="/loginFormDataUsingGetParameter",method=RequestMethod.POST)
	public String handleFormUsingGetParameter(HttpServletRequest request)
	{	
		//fetch "name" id from .jsp by using request.getParameter("") and display the result in success.jsp
		String email = request.getParameter("userEmailData");
		System.out.println("Email: "+email);
		String name = request.getParameter("userNameData");
		System.out.println("Name: "+name);
		String password = request.getParameter("userPasswordData");
		System.out.println("Password: "+password);
		return "success";	
	}
	
	//using @RequestParam()
	@RequestMapping(path="/loginFormDataUsingRequestParam",method=RequestMethod.POST)
	public String handleFormusingRequestParam(@RequestParam("userEmailData") String userEmail,@RequestParam("userNameData") String userName,
			                                             @RequestParam("userPasswordData") String userPassword)
	{	
		//fetch "name" id from .jsp by using @RequestParam()
		System.out.println("userEmail: "+userEmail);
		System.out.println("userName: "+userName);
		System.out.println("userPassword: "+userPassword);
		return "";	
	}

	//using @RequestParam with Model
	@RequestMapping(path="/loginFormDataUsingModel",method=RequestMethod.POST)
	public String handleFormusingModel(@RequestParam(name="userEmailData",required=false) String userEmail,
												@RequestParam("userNameData") String userName,
												@RequestParam("userPasswordData") String userPassword, 
												Model model)
	{	
		//fetch "name" id from .jsp by using @RequestParam()
		System.out.println("userEmail: "+userEmail);
		System.out.println("userName: "+userName);
		System.out.println("userPassword: "+userPassword);
		
		//fetch "id","name","password" id from .jsp by using Both @RequestParam with Model and display the result in success.jsp
		model.addAttribute("email", userEmail);
		model.addAttribute("name", userName);
		model.addAttribute("password", userPassword);
		return "success";	
	}
	
	//using @RequestParam with Model with User
		@RequestMapping(path="/loginFormDataUsingModelWithUser",method=RequestMethod.POST)
		public String handleFormusingModelWithUser(@RequestParam("userEmailData") String userEmail,
													@RequestParam("userNameData") String userName,
													@RequestParam("userPasswordData") String userPassword, 
													Model model)
		{	
			User userData = new User();
			userData.setUserEmailData(userEmail);
			userData.setUserNameData(userName);
			userData.setUserPasswordData(userPassword);
			
			System.out.println("Users Data: "+userData);
						
			//fetch "id","name","password" id from .jsp by using Both @RequestParam with Model and display the result in success2.jsp
			model.addAttribute("usersdata", userData);
			return "success2";	
		}
		
		//using Model with User and @ModelAttribute(Create a User model with same property name as loginform.jsp label input 'name'
			@RequestMapping(path="/loginFormDataUsingModelWithUserAndModelAttribute",method=RequestMethod.POST)
			public String handleFormusingModelWithUserAndModelAttribute(@ModelAttribute User user, Model model)
			{			
				System.out.println("Users: "+user);
							
				//fetch "id","name","password" id from .jsp by using Both @ModelAttribute with Model and display the result in success3.jsp
				model.addAttribute("usersdata", user);
				return "success3";	
			}
}
