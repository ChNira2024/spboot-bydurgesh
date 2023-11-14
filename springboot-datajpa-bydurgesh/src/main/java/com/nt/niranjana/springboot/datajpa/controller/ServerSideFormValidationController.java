package com.nt.niranjana.springboot.datajpa.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.niranjana.springboot.datajpa.entity.User;

import jakarta.validation.Valid;



@Controller
public class ServerSideFormValidationController 
{
	@RequestMapping(value="/showform",method=RequestMethod.GET)
	public String showForm(Model model)
	{
		System.out.println("Inside showForm method..");
		model.addAttribute("name","Niranjana");
		model.addAttribute("Date",new Date().toLocaleString());
		return "form";
	}
	
	@GetMapping("/showform2")
	public String showForm2(Model model)
	{
		System.out.println("Inside showForm2 method..");
		model.addAttribute("formdata",new User());	
		return "form2";
	}
	
	//handle process form
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("formdata") User data,BindingResult result,Model model)
	{

		if(result.hasErrors())
		{
			System.out.println(result);
			return "form2";
		}
		System.out.println("User Entity Data: "+data);
		//fetch "id","name","password" id from .html by using Both @ModelAttribute with Model and display the result in success.html
		model.addAttribute("loggedindata", data);
		return "success";
	}

}
