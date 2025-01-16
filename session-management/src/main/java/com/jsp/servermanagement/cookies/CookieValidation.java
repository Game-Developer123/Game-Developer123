package com.jsp.servermanagement.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieValidation extends HttpServlet{
	
	Cookie cookie = null;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(cookie==null)
		{
			cookie = new Cookie("name", "chaitanya");
			resp.addCookie(cookie);
			RequestDispatcher rq=req.getRequestDispatcher("login.html");
			rq.forward(req, resp);
		}
		else
		{
			RequestDispatcher rq=req.getRequestDispatcher("welcome.html");
			rq.forward(req, resp);
		}
	}
	
}

