package com.nt.niranjana.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IDPasswordCheckInterceptorController 
{
	
	@RequestMapping("/loginWithIDPWD") 
	public String loginFormMethod()
   { 
		System.out.println("LogIn Form method");
	   return "idpwdvalivationform"; 
   }

	//using @RequestParam with Model
	@RequestMapping(path="/loginFormDataUsingModelInterceptor",method=RequestMethod.POST)
	public String handleFormusingModel(@RequestParam("userNameData") String userName,
												@RequestParam("userPasswordData") String userPassword, 
												Model model)
	{	
		//fetch "name" id from .jsp by using @RequestParam()
		System.out.println("userName: "+userName);
		System.out.println("userPassword: "+userPassword);
		
		//fetch "id","password" id from .jsp by using Both @RequestParam with Model and display the result in success.jsp
		model.addAttribute("name", userName);
		model.addAttribute("password", userPassword);
		return "success";	
	}
	
	
		
}
