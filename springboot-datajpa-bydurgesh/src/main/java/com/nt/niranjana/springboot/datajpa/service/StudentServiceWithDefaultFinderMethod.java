package com.nt.niranjana.springboot.datajpa.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.niranjana.springboot.datajpa.entity.Students;
import com.nt.niranjana.springboot.datajpa.exception.CustomInsertException;
import com.nt.niranjana.springboot.datajpa.exception.ResourceNotFoundException;
import com.nt.niranjana.springboot.datajpa.repo.StudentRepositoryWithDefaultMethod;

@Service
public class StudentServiceWithDefaultFinderMethod 
{
	Logger logger = LogManager.getLogger(StudentRepositoryWithDefaultMethod.class);

	@Autowired
	private StudentRepositoryWithDefaultMethod studentRepo;
	
	//get all book details from DB
	public List<Students> getAllStudentsClassDetailsFromDB() 
	{
		System.out.println("This is Service getAllStudentsClassDetailsFromDB");
		logger.info("StudentServiceWithDefaultFinderMethod: This is getAllStudentsClassDetailsFromDB method{}");
		try
		{
			List<Students> getAllStudentsDetails = studentRepo.findAll();
			System.out.println("After findAll");
			logger.info("StudentServiceWithDefaultFinderMethod:getAllStudentsDetails from Databse"+getAllStudentsDetails);
			return getAllStudentsDetails;
		}
		catch(CustomInsertException cie)
		{
			throw new CustomInsertException("Ploblem to Insert Multiple data Into Database");
		}
	}

	//get Single Students details From DB by using its ID
	  public Students getStudentsClassDetailsFromDBByUsingItsID(int id)
	  {
		  System.out.println("This is Service getStudentsClassDetailsFromDBByUsingItsID");
		  Students getSingleStudentsDetails = studentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Given Id not Present: "+id));
		  System.out.println("getSingleStudentsDetails: "+getSingleStudentsDetails);
		return getSingleStudentsDetails;
	  }
	  
	//insert single Students class details into DB
	public Students insertStudentsClassDetailsIntoDB(Students studentDetails)
	{
		System.out.println("This is Service insertStudentsClassDetailsIntoDB method");
		Students studentDetailsInserted = studentRepo.save(studentDetails);
		System.out.println("studentDetailsInserted: "+studentDetailsInserted);
		System.out.println("After Save");
		return studentDetailsInserted;
	}
	
	//At a time Insert Multiple students class details into DB
	public List<Students> insertMultipleStudentsClassDetailsIntoDB(List<Students> studentDetails) 
	{
		System.out.println("This is Service insertMultipleStudentsClassDetailsIntoDB");
		List<Students> multiplestudentsDataInserted = studentRepo.saveAll(studentDetails);
		System.out.println("After SaveAll");
		return multiplestudentsDataInserted;
	}
	
	 //delete single students data using its ID
	  public void deleteSingleStudentsData(int id)
	  {
		  System.out.println("This is Service deleteSingleStudentsData");
		  studentRepo.deleteById(id);
	  }
}
