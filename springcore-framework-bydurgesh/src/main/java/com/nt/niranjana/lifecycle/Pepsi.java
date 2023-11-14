package com.nt.niranjana.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean
{
	
	private double price;
	
	public void setPrice(double price)
	{
		System.out.println("setting in price");
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public Pepsi()
	{
		super();
	}
	public Pepsi(double price)
	{
		this.price=price;
	}
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("I am inside init method with afterPropertiesSet");
	}
	public void destroy() throws Exception 
	{
		System.out.println("I am inside destroy method,destroy()");
		
	}

}
