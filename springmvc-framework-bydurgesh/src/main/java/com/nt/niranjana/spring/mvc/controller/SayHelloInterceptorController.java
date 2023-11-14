package com.nt.niranjana.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHelloInterceptorController 
{

	@RequestMapping("/sayhelloform")
	public String sayHelloForm()
	{
		return "sayhello";
	}
	@RequestMapping("/hellomsgdisplay")
	public String sayhello(@RequestParam("user") String data,Model model)
	{
		System.out.println("Inside SayHello Method");
		model.addAttribute("msg",data);
		return "hellomsg";
	}
}
