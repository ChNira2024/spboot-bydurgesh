package com.nt.niranjana.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.niranjana.entity.NoteTakerEntity;
import com.nt.niranjana.helper.FactoryProvider;


public class UpdateServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public UpdateServlet() 
    {
        super();
    }


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			String  noteTitle = request.getParameter("noteTitle");  //get from edit.jsp file
			String  noteContent = request.getParameter("noteContent");   //get from edit.jsp file
			
			int noteId = Integer.parseInt(request.getParameter("noteId").trim());
			SessionFactory  factory= FactoryProvider.getFactory();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();  //to store data in db permanently
			 NoteTakerEntity note = session.get(NoteTakerEntity.class,noteId);
			 note.setTitle(noteTitle);
			 note.setContent(noteContent);
			 note.setAddedDate(new Date());			 
			 response.sendRedirect("all_notes.jsp");
			 
			tx.commit();
			session.close(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
