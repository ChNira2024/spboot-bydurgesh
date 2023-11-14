package com.nt.niranjana.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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



public class SaveNoteServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public SaveNoteServlet() {
        super();
    }
		
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			String  noteTitle = request.getParameter("noteTitle");  //got from add_notes.jsp file
			String  noteContent = request.getParameter("noteContent");   //got from add_notes.jsp file
			
			NoteTakerEntity noteTakerEntity = new NoteTakerEntity(noteTitle,noteContent,new Date());
			System.out.println(noteTakerEntity.getId()+" : "+noteTakerEntity.getTitle()); 
			
			//hibernate : save() method to store data in DB 			
			SessionFactory  factory= FactoryProvider.getFactory();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();  //to store data in db permanently
			session.persist(noteTakerEntity);
			tx.commit();
			session.close();
			System.out.println("Note added in DB Successfully!!"); //display in console
			
			//To display Message in browser in same url then:
			PrintWriter pw = response.getWriter();
			pw.println("<h2 style='color:blue;'>Note added in DB Successfully!!</h2>");
			pw.println("<h2 style='color:blue;'><a href='all_notes.jsp'>View all notes</a></h2>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
