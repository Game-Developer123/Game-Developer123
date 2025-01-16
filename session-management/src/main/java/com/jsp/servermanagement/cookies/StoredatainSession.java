package com.jsp.servermanagement.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/savedata")
public class StoredatainSession extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs = req.getSession();
		HttpSession hs1 = req.getSession();
		
//		System.out.println(hs);
//		System.out.println(hs1);
		
//		hs.setAttribute("id", 1);
//		hs.setAttribute("name", "Chaitanya");
//		hs.setAttribute("age", 10);
//		
//		Integer id = (Integer) hs.getAttribute("id");
//		String name= (String) hs.getAttribute("name");
//		Integer age = (Integer) hs.getAttribute("age");
//		String dob = (String) hs.getAttribute("dob");
//		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(dob);
//		
//		hs.removeAttribute("id");
//		
//		System.out.println(hs.getAttribute("id"));
//		hs.invalidate();
		
		hs.setAttribute("id", 1);
		hs.setAttribute("name", "Chaitanya");
		hs.setAttribute("age", 10);
		
		RequestDispatcher rd = req.getRequestDispatcher("ses2");
		rd.forward(req, resp);
	}

}
