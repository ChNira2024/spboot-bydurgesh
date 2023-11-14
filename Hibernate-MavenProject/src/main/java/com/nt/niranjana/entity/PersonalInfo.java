package com.nt.niranjana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="hbn_employee_personalinfo")
public class PersonalInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aadharCardNumber;
	private String voteCardNumber;
	private String panCardNumber;

	@OneToOne(mappedBy = "personalInfo")
	private Employee employee;
}