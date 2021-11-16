package com.techjs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		ServletContext context = getServletContext();
		String country = (String) context.getInitParameter("country");
		System.out.println(country);
		PrintWriter out = resp.getWriter();
		out.println(country);

	}

}
