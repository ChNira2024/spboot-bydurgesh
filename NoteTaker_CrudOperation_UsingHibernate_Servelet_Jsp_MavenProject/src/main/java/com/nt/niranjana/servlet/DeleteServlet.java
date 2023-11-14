package com.nt.niranjana.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.niranjana.entity.NoteTakerEntity;
import com.nt.niranjana.helper.FactoryProvider;


public class DeleteServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
 
    public DeleteServlet() 
    {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			 int noteId = Integer.parseInt(request.getParameter("note_id").trim());
			 
			 Session ses = FactoryProvider.getFactory().openSession();
			 Transaction tx = ses.beginTransaction();
			 NoteTakerEntity note = ses.get(NoteTakerEntity.class, noteId);
			// ses.delete(note);  //deprecated from hibernate version 6.0, so we can use ses.remove()
			 ses.remove(note);//Request for Appraisal Score Card
			 tx.commit();//I am writing to bring to your attention that I have not yet received my appraisal score card ,so kindly request you look 
			 //into this and provide me with the appraisal score card.I look forward to your prompt response and resolution. 
			 ses.close();
			 response.sendRedirect("all_notes.jsp");
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
