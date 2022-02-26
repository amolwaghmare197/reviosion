<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="menu.jsp"%>
<%@ page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>
	<h2>All Registration</h2>
	<table border='1'>
		<tr>
			<th>user</th>
			<th>password</th>
			<th>delete</th>
		</tr>
		<%
		ResultSet rs1  =  (ResultSet)request.getAttribute("result");
		while(rs1.next()){
			
		%>
		<tr>
		<td><%=rs1.getString(1) %></td>
		<td><%=rs1.getInt(2) %></td>
		<td><a href="deleteCont?email=<%= rs1.getString(1)%>">delet</a></td>
		
		</tr>
		<%} %>
	</table>
</body>
</html>
