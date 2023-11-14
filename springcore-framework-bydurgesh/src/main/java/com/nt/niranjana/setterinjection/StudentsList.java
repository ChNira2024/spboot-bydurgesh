package com.nt.niranjana.setterinjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentsList 
{
	private String name;
	private List<String> phoneno;
	private Set<String> address;
	private Map<String,String> course;
	private Properties dbConfiguration;
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(List<String> phoneno) {
		this.phoneno = phoneno;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Properties getDbConfiguration() {
		return dbConfiguration;
	}
	public void setDbConfiguration(Properties dbConfiguration) {
		this.dbConfiguration = dbConfiguration;
	}
	/**
	 * 
	 */
	public StudentsList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentsList(String name, List<String> phoneno, Set<String> address, Map<String, String> course,
			Properties dbConfiguration) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
		this.course = course;
		this.dbConfiguration = dbConfiguration;
	}
	@Override
	public String toString() {
		return "StudentsList [name=" + name + ", phoneno=" + phoneno + ", address=" + address + ", course=" + course
				+ ", dbConfiguration=" + dbConfiguration + "]";
	}
}
