<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emplopyee Details</title>
</head>
<body>
<h2 style="color: blue">EMPLOYEE DETAILS</h2>

<!-- fetch the data using Expression language,bydefault EL is false so that we need do 'true' manually -->
<h2>Student Id is:${id}</h2>
<h2>Student Name is:${name}</h2>
<h2>Local Date and Time is:${ldt}</h2>
<hr>
<!-- fetch list of object data using Expression Language with JSTL language -->
<c:forEach var="mark" items="${markList}">
	<%-- <h2>${mark}</h2> --%>
	<h2><c:out value="${mark}"></c:out></h2>
</c:forEach>

</body>
</html>