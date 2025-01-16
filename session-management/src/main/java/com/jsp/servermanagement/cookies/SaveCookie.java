package com.jsp.servermanagement.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savecookies")
public class SaveCookie extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("Hello WOrld...!!!");
		
		Cookie cookie = new  Cookie("name", "Chaitanya");
//		cookie.setMaxAge(10);
		
		Cookie cookie1 = new Cookie("age", "22");
//		cookie1.setMaxAge(10 );
		
		resp.addCookie(cookie1);
		
		resp.addCookie(cookie);
	}
	

}
