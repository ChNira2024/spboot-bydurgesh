package com.nt.niranjana.springboot.datajpa.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nt.niranjana.springboot.datajpa.entity.Students;
import com.nt.niranjana.springboot.datajpa.service.StudentServiceWithDefaultFinderMethod;

@WebMvcTest(value=TestStudentControllerWithDefaultFinderMethod.class)
public class TestStudentControllerWithDefaultFinderMethod 
{
	@MockBean     //create a dummy object for given class
	private StudentServiceWithDefaultFinderMethod studentService;
	
	@Autowired
	private MockMvc mockMvc;   //used to send request to our reatapi
	
	//@InjectMocks
    //private StudentControllerWithDefaultFinderMethod myController;
	
	@Test
	public void testFetchAllStudentsDetails() throws Exception
	{
		List listOfStudents = List.of(new Students(101,"rajesh","kolkata",20000f),new Students(101,"rajesh","kolkata",20000f),new Students(101,"rajesh","kolkata",20000f));
		System.out.println("listofStudents:"+listOfStudents);
		
		when(studentService.getAllStudentsClassDetailsFromDB()).thenReturn(listOfStudents);
		
		
			MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/fetchAllStudentsDetails"); //create the request
			ResultActions perform =  mockMvc.perform(requestBuilder);//send the request
			MvcResult mvcResult =  perform.andReturn();//result of the request
			
			System.out.println("mvcResult:"+mvcResult);
			MockHttpServletResponse response = mvcResult.getResponse();
			int status = response.getStatus();
			System.out.println("status:"+status);
			assertEquals(200, status);

	}

}
