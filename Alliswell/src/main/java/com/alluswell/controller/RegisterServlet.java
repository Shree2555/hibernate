package com.alluswell.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alluswell.entity.FacebookUser;
import com.alluswell.service.FacebookService;
import com.alluswell.service.FacebookServiceInterface;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name =request.getParameter("nm");
		String password =request.getParameter("pass");
		String email =request.getParameter("email");
		String address =request.getParameter("add");
		
		FacebookUser fb=new FacebookUser();
		fb.setName(name);
		fb.setPassword(password);
		fb.setEmail(email);
		fb.setAddress(address);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.createProfileService(fb);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		out.println("profile created");
		out.println("</body> </html>");
		
	}

}
