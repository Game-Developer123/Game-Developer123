<%@page import="java.sql.ResultSet"%>
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
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","N#@98wrft45");
	PreparedStatement ps = con.prepareStatement("select * from student where id = ?");
	ps.setInt(1,Integer.parseInt(id));
	ResultSet rs = ps.executeQuery();
	rs.next();
%>

<form action="updateinfo.jsp">
	Enter Id: <input type="number" name="id" value="<%=rs.getInt(1) %>" readonly>
	Enter Name: <input type="text" name="name" value="<%=rs.getString(2) %>">
	Enter Age: <input type="number" name="age" value="<%=rs.getInt(3) %>">
	<input type="submit">
</form>
</body>
</html>