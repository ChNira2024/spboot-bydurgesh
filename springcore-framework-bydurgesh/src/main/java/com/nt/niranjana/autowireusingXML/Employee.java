package com.nt.niranjana.autowireusingXML;

public class Employee 
{
	private int id;
	private String name;
	private String desg;
	
	private Salary salaryObj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Salary getSalaryObj() {
		return salaryObj;
	}

	public void setSalaryObj(Salary salaryObj) {
		this.salaryObj = salaryObj;
	}

	public Employee(int id, String name, String desg, Salary salaryObj) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.salaryObj = salaryObj;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", salaryObj=" + salaryObj + "]";
	}
	

}
