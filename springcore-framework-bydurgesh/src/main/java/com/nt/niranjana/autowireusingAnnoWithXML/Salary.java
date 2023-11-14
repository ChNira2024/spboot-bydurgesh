package com.nt.niranjana.autowireusingAnnoWithXML;

public class Salary 
{
	private double sal;
	private String tranId;
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public Salary(double sal, String tranId) {
		super();
		this.sal = sal;
		this.tranId = tranId;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Salary [sal=" + sal + ", tranId=" + tranId + "]";
	}
	
	

}
