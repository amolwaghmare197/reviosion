<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc Architect</title>
</head>
<body>
<h1>mvc Architect</h1><pre>
<form action="mvctry" method="post">
n1<input type="number" name="n1">
n2<input type="number" name="n2">
<input type="submit" value ="try mvc">
</form></pre>
<%
if(request.getAttribute("result")!=null){
	out.println("Result is:"+request.getAttribute("result"));
}
%>
</body>
</html>