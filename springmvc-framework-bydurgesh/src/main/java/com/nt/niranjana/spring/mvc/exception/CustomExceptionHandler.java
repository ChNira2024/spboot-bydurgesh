package com.nt.niranjana.spring.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomExceptionHandler 
{

	//@org.springframework.web.bind.annotation.ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)  //500 error msg shown in browser inspect console
	@org.springframework.web.bind.annotation.ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNullPointer(Model model)
	{
		model.addAttribute("msg", "Null Pointer Exception");
		return "exceptionhandlerpage";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)   //500 error msg shown in browser inspect console	
	@org.springframework.web.bind.annotation.ExceptionHandler(value=NumberFormatException.class)	
	public String exceptionHandlerNumperFormatException(Model model)
	{
		model.addAttribute("msg", "Number Format Exception");
		return "exceptionhandlerpage";
	}
}
