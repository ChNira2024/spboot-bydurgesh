package com.nt.niranjana.stereotypeAnno;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("objList")
public class StudentsList 
{
	@Value("Niranjana")
	private String name;
	
	@Value("#{studentsListOfPhone}")
	private List<String> phoneno;
	
	@Value("#{studentsListOfAddress}")
	private Set<String> address;
	
	@Value("#{studentsListOfCourse}")
	private Map<String,String> course;
	
	@Value("#{studentsOfProperty}")
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
