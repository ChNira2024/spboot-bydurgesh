<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emplopyee Details</title>
</head>
<body>
<h2 style="color: blue">EMPLOYEE DETAILS</h2>
<%
	Integer id = (Integer)request.getAttribute("id");
	String name = (String)request.getAttribute("name");
	LocalDateTime localDateTime = (LocalDateTime)request.getAttribute("ldt");
%>
<h2>Student Id is:<%=id %></h2>
<h2>Student Name is:<%=name %></h2>
<h2>Local Date and Time is:<%=localDateTime %></h2>

</body>
</html>