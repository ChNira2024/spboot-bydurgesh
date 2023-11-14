<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h2 style="color: blue">STUDENT DETAILS</h2>
<%
	Integer id = (Integer)request.getAttribute("id");
	String name = (String)request.getAttribute("name");
	List<String>	listOfCourses = (List<String>)request.getAttribute("listOfCourse");
	List<String>	listOfPhones = (List<String>)request.getAttribute("listOfPhone");
  
	
%>

<h2>Student ID is:<%=id %></h2>
<h2>Student Name is:<%=name %></h2>

<%
for(String course: listOfCourses)
{
%>
<h2><%=course%></h2>
<%
}
%>

<%
for(String course : listOfCourses)
{
	out.println(course+",");
}
%>

<%
for(String phoneList : listOfPhones)
{
	out.println(phoneList+",");
}
%>
</body>
</html>