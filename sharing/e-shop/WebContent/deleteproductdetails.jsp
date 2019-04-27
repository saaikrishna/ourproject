<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 String n = request.getParameter("p_id")
 <!-- <form method="post"  action="deleteproductcontroller"> --><form method="post"  action="deleteproductcontroller">
  out.print("<a href='deleteproductcontroller?uname=" + n + "'></a>"); 
</body>
</html>