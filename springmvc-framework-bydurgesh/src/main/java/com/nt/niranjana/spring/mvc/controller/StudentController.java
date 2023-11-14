package com.nt.niranjana.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController 
{
	@RequestMapping("/insertStudentData")
	public String registerStudentsDetails(Model model)
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

}
