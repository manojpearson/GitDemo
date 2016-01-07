package com.pearson.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
	        PrintWriter writer = response.getWriter();        
	        writer.println("<html>");
	        writer.println("<head>");
	        writer.println("<title>Sample Application Servlet Page</title>");
	        writer.println("</head>");
	        writer.println("<body bgcolor=white>");

	        writer.println("<table border=\"0\" cellpadding=\"10\">");
	        writer.println("<tr>");
	        writer.println("<td>");
	        writer.println("<img src=\"images/springsource.png\">");
	        writer.println("</td>");
	        writer.println("<td>");
	        writer.println("<h1>Sample Application Servlet</h1>");
	        writer.println("</td>");
	        writer.println("</tr>");
	        writer.println("</table>");

	        writer.println("This is the output of a servlet that is part of");
	        writer.println("the Hello World application.");

	        writer.println("</body>");
	        writer.println("</html>");
	}
		
}
