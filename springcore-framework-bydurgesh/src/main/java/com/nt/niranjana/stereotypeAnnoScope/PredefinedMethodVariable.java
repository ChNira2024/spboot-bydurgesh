package com.nt.niranjana.stereotypeAnnoScope;

import org.springframework.beans.factory.annotation.Value;

public class PredefinedMethodVariable 
{
	@Value("#{10+20}")
	private  int x;
	
	@Value("#{30+40}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(5)}")
	private double z;

	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{T(java.lang.Math).PI}")
	private double f;
	
	@Value("#{(new java.lang.String('New Object'))}")
	private String g;
	
	@Value("#{8-5>2}")
	private boolean isActive;  //By default false
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "PredefinedMethodVariable [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", f=" + f + ", g=" + g
				+ ", isActive=" + isActive + "]";
	}

	
	

	
}
