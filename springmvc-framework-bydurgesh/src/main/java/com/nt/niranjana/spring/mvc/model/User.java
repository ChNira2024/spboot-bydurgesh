package com.nt.niranjana.spring.mvc.model;

public class User {
	private String userEmailData;
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
