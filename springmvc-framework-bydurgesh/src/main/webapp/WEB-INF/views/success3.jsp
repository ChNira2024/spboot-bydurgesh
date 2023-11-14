<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color: blue">EMPLOYEE DETAILS</h2>

<!-- fetch the data using Expression language,bydefault EL is false so that we need do 'true' manually -->
<h2>Email Id is:${usersdata.userEmailData}</h2>
<h2>Name is:${usersdata.userNameData}</h2>
<h2>Password:${usersdata.userPasswordData}</h2>
<hr>
</body>
</html>