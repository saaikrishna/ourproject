<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
<style>
#header{
height:65%;width:100%;color:black;font-family:palatino;text-align:center;style:"background-image:url('timemoney.jpg');"
}

#rightdiv{
height:65% ;width:40%; color:blue;text-align:center;font-family:palatino;float:right;
}
input[type=text],select{
  width: 100%;
  padding: 5px 5px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 16px;
  box-sizing: border-box;
  }
 
 input[type=password]{
  width: 100%;
  font-size:"1";
  padding:5px 5px;
  margin: 4px 2px;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 16px;
  border-sizing: border-box;
  }
  input[type=button] {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 16px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
body,html{
background-image:url("page.jpg");background-repeat:no-repeat;}
</style>
</head>
<body>
<div id="header" style="color:blue" ><h1>SHARING ECONOMY PLATFORM</h1></div>


<div id=rightdiv>
<form method="post" action="LoginController">
<table>

<td>USER ID :</td><td><input type="text" name="USER_ID" id="USER_ID"/></td>
</tr>
<tr>
<td>PASSWORD :</td><td><input type="password" name="PASSWORD" id="PASSWORD"/></td>
</tr>
<tr><td>SELECT:</td>
<td><select name="ROLE" id="ROLE">
<option value="1" > </option>
<option value="2" >User</option>
<option value="3" >Vendor</option></select></td></tr>
<tr>
<tr>
<td><input type="submit" value="Login" name="login" id="login"/></td></tr>
<tr>
<td><a href="form1.jsp" style="font-family:corbel;color:black">Register as New User</a></td>
</tr>

</table>
</FORM>
</div>
</body>
</html>