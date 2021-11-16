package com.techjs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet
{
	String dbPath;
	String host;
	
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	dbPath = config.getInitParameter("db-path");
    	host = config.getInitParameter("db-host");
    }
	
   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	   String name = req.getParameter("eName");
	   String email = req.getParameter("eEmail");
	   String password = req.getParameter("password");
	   
//	   ServletConfig config = getServletConfig();
//	   String country = config.getInitParameter("country");
	   
	   
	   PrintWriter out = resp.getWriter();
	  // out.println("Hi :"+name+" you are associated to :"+country);
	 
//   	   dbPath = config.getInitParameter("db-path");
//   	   host = config.getInitParameter("db-host");
   	   
	   out.print("DB Path: "+dbPath+ " and DB Host :"+host);
	   
   }
}
