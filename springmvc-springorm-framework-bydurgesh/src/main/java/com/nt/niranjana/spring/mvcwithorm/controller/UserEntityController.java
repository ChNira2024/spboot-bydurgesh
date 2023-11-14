package com.nt.niranjana.spring.mvcwithorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.niranjana.spring.mvcwithorm.entity.UserEntity;
import com.nt.niranjana.spring.mvcwithorm.service.UserEntityService;


@Controller
public class UserEntityController {

	@Autowired
	private UserEntityService userEntityService;
	
	//auto-load
		@ModelAttribute
		public void registerUserDetails(Model m)
		{	
			m.addAttribute("Header", "Registration Form"); //USED THIS IN loginform.jsp
			System.out.println("Auto-loading @ModelAttribute before handler");	
		}
		
		@RequestMapping("/") 
		public String register()
	   { 
			return "index";
	   }
		
		@RequestMapping("/login") 
		public String registerUserDetails()
	   { 
			System.out.println("registerUserDetails method");
		   return "loginform"; 
	   }
	
	//using Model with User and @ModelAttribute(Create a User model with same property name as loginform.jsp label input 'name'
	@RequestMapping(path="/loginFormDataUsingModelWithUserAndModelAttributeWithSpringORM",method=RequestMethod.POST)
	public String handleFormusingModelWithUserAndModelAttribute(@ModelAttribute UserEntity userEntity, Model model)
	{			
		System.out.println("Users: "+userEntity);
		
		userEntityService.createUser(userEntity);
					
		//fetch "id","name","password" id from .jsp by using Both @ModelAttribute with Model and display the result in success3.jsp
		model.addAttribute("usersdata", userEntity);
		return "success4";	
	}
	
	
}
