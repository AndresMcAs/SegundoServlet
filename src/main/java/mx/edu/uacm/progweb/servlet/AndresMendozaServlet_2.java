package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AndresMendozaServlet_2 extends HttpServlet {

   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		 
   
	String nombre=req.getParameter("nombre");
	String apellido =req.getParameter("apellido");
	PrintWriter salida = resp.getWriter();
	salida.println("Hola mi nombre es " + nombre + " y mi apellido " + apellido);
	
	  
	 
  }

}
