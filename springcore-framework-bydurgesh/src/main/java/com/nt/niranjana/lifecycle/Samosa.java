package com.nt.niranjana.lifecycle;

public class Samosa 
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
	
	public Samosa()
	{
		super();
	}
	public Samosa(double price)
	{
		this.price=price;
	}
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("I am inside init method");
	}

	public void destroy()
	{
		System.out.println("I am inside destroy method");
	}
	
	public void i()
	{
		System.out.println("I am inside i method");
	}

	public void d()
	{
		System.out.println("I am inside d method");
	}

}
