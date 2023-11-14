package com.nt.niranjana.springboot.datajpa.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User 
{
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid Email!!")
	private String userEmailData;
	
	@NotBlank(message="User Name can not be empty!!")
	@Size(min = 5,max = 10, message = "user name should be 5 - 10 characters")
	private String userNameData;
	private String userPasswordData;
	public String getUserEmailData() {
		return userEmailData;
	}
	public void setUserEmailData(String userEmailData) {
		this.userEmailData = userEmailData;
	}
	public String getUserNameData() {
		return userNameData;
	}
	public void setUserNameData(String userNameData) {
		this.userNameData = userNameData;
	}
	public String getUserPasswordData() {
		return userPasswordData;
	}
	public void setUserPasswordData(String userPasswordData) {
		this.userPasswordData = userPasswordData;
	}
	@Override
	public String toString() {
		return "User [userEmailData=" + userEmailData + ", userNameData=" + userNameData + ", userPasswordData="
				+ userPasswordData + "]";
	}
	
	

}
