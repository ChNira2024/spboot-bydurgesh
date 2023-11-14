package com.nt.niranjana.spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController2 
{
	@RequestMapping("/insertEmployeeData2")
	public ModelAndView registerEmployeeDetails()
	{
		//creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		
		//set the employee data
		modelAndView.addObject("id", 101);
		modelAndView.addObject("name", "Niranjana");
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(80);
		marks.add(79);
		marks.add(98);
		marks.add(99);
		
		//set date and time
		LocalDateTime localDateTime = LocalDateTime.now();
		modelAndView.addObject("ldt", localDateTime);
		modelAndView.addObject("markList", marks);
		
		//set view as jsp to display using modelAndView object
		modelAndView.setViewName("employeeDetails2");
		return modelAndView;
	}
}
