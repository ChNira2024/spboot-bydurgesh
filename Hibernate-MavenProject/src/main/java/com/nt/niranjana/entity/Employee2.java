package com.nt.niranjana.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="hbn_eidiko_employee2")
public class Employee2 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private String bloodGroup;

	@ManyToMany
	@JoinTable(name="fk_employee_project",
	            joinColumns = {@JoinColumn(name="project_id")},
	            inverseJoinColumns = {@JoinColumn(name="project_name")})  //here we are taking our own choice FK table name
	private List<Projects> project;
}
//if we didnot take this @JoinTable then automatically table create with default name(DB generate automatically i.e employee2_project) having FK of Project class object data.