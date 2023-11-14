package com.nt.niranjana.spring.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyIDPwdValidationInterceptor implements HandlerInterceptor
{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception 
	{
		System.out.println("This is Pre-handle method");
		String secureName = "Niranjana";
		String securePwd = "niranjana";
		
		String name = request.getParameter("userNameData");
		String password = request.getParameter("userPasswordData");
		if(!name.equals(secureName) && !password.equals(securePwd))
		{
			response.setContentType("text/html");
			response.getWriter().println("You Have Wrong ID &  PWD");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception 
	{
		System.out.println("This is Post-handle method");
		//HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception 
	{
		System.out.println("This is After Completion method");
		//HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
