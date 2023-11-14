package com.nt.niranjana.spring.mvcwithorm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userEmailData;
	private String userNameData;
	private String userPasswordData;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		return "UserEntity [id=" + id + ", userEmailData=" + userEmailData + ", userNameData=" + userNameData
				+ ", userPasswordData=" + userPasswordData + "]";
	}
	
	

}
