package com.nt.niranjana.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Food 
{
	private String biriyani;
	private String raita;
	public String getBiriyani() {
		return biriyani;
	}
	public void setBiriyani(String biriyani) {
		this.biriyani = biriyani;
	}
	public String getRaita() {
		return raita;
	}
	public void setRaita(String raita) {
		this.raita = raita;
	}
	public Food(String biriyani, String raita) {
		super();
		this.biriyani = biriyani;
		this.raita = raita;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Food [biriyani=" + biriyani + ", raita=" + raita + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("i am init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("i am destroy method");
	}

}
