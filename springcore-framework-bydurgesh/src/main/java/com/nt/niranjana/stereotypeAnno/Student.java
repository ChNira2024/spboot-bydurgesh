package com.nt.niranjana.stereotypeAnno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("studentManualId")
public class Student 
{
	@Value("101")
	private int sNo;
	
	@Value("Raju")
	private String sName;
	
	@Value("Hyderabad")
	private String sAddrs;
	
	@Value("100000")
	private double sSal;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		System.out.println("Here I am passing student sNO");
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		System.out.println("Here I am passing student sName");
		this.sName = sName;
	}
	public String getsAddrs() {
		return sAddrs;
	}
	public void setsAddrs(String sAddrs) {
		System.out.println("Here I am passing student sAddrs");
		this.sAddrs = sAddrs;
	}
	public double getsSal() {
		return sSal;
	}
	public void setsSal(double sSal) {
		System.out.println("Here I am passing student sSal");
		this.sSal = sSal;
	}
	public Student(int sNo, String sName, String sAddrs, double sSal) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sAddrs = sAddrs;
		this.sSal = sSal;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sAddrs=" + sAddrs + ", sSal=" + sSal + "]";
	}
	
	
}
