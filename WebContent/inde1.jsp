<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="a1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>first jsp prog</h1>
<%!
public int y = 100;
public int text(){
	return 10;
}
%>

<%
int x =10;
System.out.println(x);
out.println(x);
request.setAttribute("msg", "you done it beutifully baby");
out.println(request.getAttribute("msg"));
out.println(y);
out.println(text());
%>
</body>
</html>