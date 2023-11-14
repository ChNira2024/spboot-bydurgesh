package com.nt.niranjana.constructorinjection;

public class AmbiguityProblemCI 
{
	private int idNo;
	private int sal;
	
	
	public AmbiguityProblemCI(int idNo, int sal) 
	{
		super();
		this.idNo = idNo;
		this.sal = sal;
		System.out.println("int-arg constructor");
	}
	
	public AmbiguityProblemCI(double idNo, double sal) 
	{
		super();
		this.idNo = (int) idNo;
		this.sal = (int) sal;
		System.out.println("double-arg constructor");
	}
	
	public AmbiguityProblemCI(String idNo, String sal) 
	{
		super();
		this.idNo = Integer.parseInt(idNo);
		this.sal = Integer.parseInt(sal);
		System.out.println("String-arg constructor");
	}

	
	
	@Override
	public String toString() {
		return "AmbiguityProblemCI [idNo=" + idNo + ", sal=" + sal + "]";
	}

	public void doSum()
	{
		System.out.println("idNo: "+this.idNo);
		System.out.println("sal: "+this.sal);
	}
	

}
