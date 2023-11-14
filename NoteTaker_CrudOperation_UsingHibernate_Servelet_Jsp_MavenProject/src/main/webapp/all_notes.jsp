<%@page import="com.nt.niranjana.entity.NoteTakerEntity"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.nt.niranjana.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h2>All Notes:</h2>
		<%-- <%
  			Session ses  = FactoryProvider.getFactory().openSession();
    		 Query q = ses.createQuery("from NoteTakerEntity");
    		 List<NoteTakerEntity> list = q.list();
    		 for(NoteTakerEntity note : list)
    		 {
    			 out.println(note.getId()+" : "+note.getAddedDate()+" : "+note.getContent()+" : "+note.getTitle()+"<br>");
    		 }   	
    		ses.close();    	
    	%> --%>

		<div class="row">
			<div class="col-12">
				<%
				Session ses = FactoryProvider.getFactory().openSession();
				Query q = ses.createQuery("from NoteTakerEntity");
				List<NoteTakerEntity> list = q.list();
				for (NoteTakerEntity note : list) {
				%>
				<div class="card mt-3">
					<img class="card-img-top pl-4" style="max-width:100px;" src="image/notepad.png" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-id"><%=note.getId()%></h5><h5 class="card-date"><%=note.getAddedDate()%></h5>
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						<a href="DeleteServlet?note_id=<%=note.getId() %>" class="btn btn-danger">Delete</a>
						<a href="edit.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>
					</div>
				</div>

				<%
				}
				ses.close();
				%>
			</div>
		</div>
	</div>
</body>
</html>