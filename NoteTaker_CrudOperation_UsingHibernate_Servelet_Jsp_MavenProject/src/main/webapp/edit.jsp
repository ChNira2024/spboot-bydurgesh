<%@page import="com.nt.niranjana.entity.NoteTakerEntity"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.nt.niranjana.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h2>This is edit page</h2>
		<br>
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
		Session ses = FactoryProvider.getFactory().openSession();
		NoteTakerEntity note = ses.get(NoteTakerEntity.class, noteId);
		%>
		<form action="UpdateServlet" method="post">
		<input value="<%=note.getId() %>" name="noteId" type="hidden" />
			<div class="form-group">
				<label for="title">Note Title</label> 
				<input 
				name="noteTitle"
					required 
					type="text" 
					class="form-control" 
					id="title"
					aria-describedby="emailHelp"
					placeholder="Enter title here"
					value="<%=note.getTitle() %>" />
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Note Content</label>
				<textarea name="noteContent" required id="content"
					placeholder="Enter your content here" class="form-control"
					style="height: 300px">
					<%=note.getContent() %>
				</textarea>
			</div>

			<button type="submit" class="btn btn-primary">Add</button>
		</form>
	</div>

</body>
</html>