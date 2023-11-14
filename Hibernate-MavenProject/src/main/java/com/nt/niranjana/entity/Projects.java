package com.nt.niranjana.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hbn_employee2_projects")
public class Projects 
{
	@Id
	private int projectId;
	
	@Column(name="project_name")
	private String projectsName;
	
	@ManyToMany(mappedBy = "project")
	private List<Employee2> employees;
}
