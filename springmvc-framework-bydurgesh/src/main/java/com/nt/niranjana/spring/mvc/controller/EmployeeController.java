package com.nt.niranjana.spring.mvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController 
{
	@RequestMapping("/insertEmployeeData")
	public ModelAndView registerEmployeeDetails()
	{
		//creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();

		//set the employee data
		modelAndView.addObject("id", 101);
		modelAndView.addObject("name", "Niranjana");
		
		//set date and time
		LocalDateTime localDateTime = LocalDateTime.now();
		modelAndView.addObject("ldt", localDateTime);
		
		//set view as jsp to display using modelAndView object
		modelAndView.setViewName("employeeDetails");
		return modelAndView;
	}
}
