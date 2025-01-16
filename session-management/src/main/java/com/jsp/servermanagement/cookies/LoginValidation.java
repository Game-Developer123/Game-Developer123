package com.jsp.servermanagement.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/loginpage")
public class LoginValidation extends GenericServlet{
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.equals("A@gmail.com")&& password.equals("12345678")) {
			RequestDispatcher rq=req.getRequestDispatcher("welcome.html");
			rq.forward(req, res);
		}
		else {
			PrintWriter pw=res.getWriter();
			pw.print("<h1> Invalid Credentials...</h1>");
			
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		
		
		
		
	}

}
