package com.nt.niranjana.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController 
{
	@RequestMapping("/search")
	public String search()
	{
		return "searchform";
	}
	
	@RequestMapping(path="/searchdata",method=RequestMethod.POST	)
	public RedirectView searchData(@RequestParam("querybox") String searching)
	{
		//String data = null;  //manually passing NullPointerException
		//data.length();
		
		//Integer.parseInt(searching);   //manually passing NumberFormatException
		
		RedirectView redirectView = new RedirectView();
		if(searching.isBlank())
		{
			redirectView.setUrl("search");  //redirect to url: /search
		}
		String url = "https://www.google.com/search?q="+searching;
		
		redirectView.setUrl(url);
		
		return redirectView;
	}
}
