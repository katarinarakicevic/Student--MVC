<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String msg = (String)request.getAttribute("msg");
if (msg != null && msg.length()>0){
%>
<h3><%=msg %></h3>
<%} %>

<form action="Servlet" method="get">
Ime: <input type="text" name="ime"><br>
Prezime: <input type="text" name="prezime"><br>
Prosek: <input type="text" name="prosek"><br>
<input type="submit" value="Posalji"> 
</form>


</body>
</html>
