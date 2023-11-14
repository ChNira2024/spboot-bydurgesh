<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add NotesTaker</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
<div class="container">
    	<%@include file="navbar.jsp"%>
    	<br>
    	<h2>Please fill your note details</h2>
   
    
    <!-- This is add form -->
	<form action="SaveNoteServlet" method="post">
		<div class="form-group">
			<label for="title">Note Title</label> 
				<input
					name="noteTitle"
					required
					type="text" 
					class="form-control" 
					id="title"
					aria-describedby="emailHelp" 
					placeholder="Enter title here"> 
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Note Content</label> 
				<textarea
				name="noteContent" 
				required
					id="content" 
					placeholder="Enter your content here"
					class="form-control"
					style="height:300px">
				</textarea>
		</div>
		 
		<button type="submit" class="btn btn-primary">Add</button>
	</form>
	</div>
</body>
</html>