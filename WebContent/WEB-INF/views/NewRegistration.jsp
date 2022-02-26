<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2>new registration</h2><pre>
<form action="savereg" method="post">
PersonId<input type="text" name="PersonId">
fname<input type="text" name="fname">
lname <input type="text" name="lname">
Address<input type="text" name="Address">
no<input type="number" name="no">
<input type="submit" value="sign up">
</form></pre>
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}
%>
</body>
</html>