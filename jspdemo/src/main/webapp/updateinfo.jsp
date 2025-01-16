<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
	PreparedStatement ps = con.prepareStatement("update student set name=?, age=? where  id=?");
	ps.setString(1,name);
	ps.setInt(2,Integer.parseInt(age));
	ps.setInt(3,Integer.parseInt(id));
	ps.execute();
	
	RequestDispatcher rd = request.getRequestDispatcher("Fetchalldata.jsp");
	rd.forward(request,response);


%>
</body>
</html>