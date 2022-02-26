<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mini project</title>
</head>
<body>
<h1>mini project</h1><pre>
<form action="loginController" method="post">
email<input type="text" name="email">
password<input type="text" name="password">
<input type="submit" value ="try mvc">
</form></pre>
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}
%>
</body>
</html>