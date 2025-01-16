package com.jsp.servermanagement.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ses2")
public class Session2 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs3 = req.getSession();
		System.out.println(hs3.getAttribute("id"));
		System.out.println(hs3.getAttribute("name"));
		System.out.println(hs3.getAttribute("age"));
	}

}
