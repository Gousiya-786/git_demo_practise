package com.wipro.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PerformServlet
 */
@WebServlet("/perform")
public class PerformServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fno = request.getParameter("t1");
		String sno = request.getParameter("t2");
		
		
		int x = Integer.parseInt(fno);
		int y = Integer.parseInt(sno);
		
		int z = x+y;
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1> The Sum is : " +z+ "</h1>");
		pw.close();
		}

}
