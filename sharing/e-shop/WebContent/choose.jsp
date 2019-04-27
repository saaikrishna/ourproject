<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Choose one</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
body,html{
background-image:url("f.jpg");background-repeat:no-repeat;background-position:center;text-align:center; background-size: 1050px 1150px;}
#header{
height:15%;width:100%;font-family:arial;text-align:center;color:white;
}
#rightdiv{
height:85;width:60%;font-family:garamond;color:black;float:right;text-align:left;
}

input[type=text], select {
  width: 350%;
  background-color: white;
  padding: 10px 10px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 20px;
  box-sizing: border-box;
}

input[type=submit] {
 width: 100%;
  padding: 10px 10px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 16px;
  box-sizing: border-box;
}

input[type=submit]{
  background-color: aqua;
}

</style>
</head>
<body><center>
<ul>
  <li><a class="active" href="home.jsp">Home</a></li>
  <li><a href="updatedetailsvendor.jsp">Update details</a></li>
  <li><a href="contact.jsp">Contact</a></li>

</ul></center>
<div id="header"><h2>Category Selection</h2></div>
<div id="rightdiv">
  <form action="Main" method="post">
  <table style="text-align:center">
  <tr>
<td><a href="addproduct.jsp" style="font-family:corbel;color:black;font-size:"6"">ADD PRODUCT</a></td>
</tr>
<tr>
<td><a href="viewproduct.jsp" style="font-family:corbel;color:black;font-size:"6"">VIEW PRODUCT</a></td>
</tr>
<tr>
<td><a href="addservices.jsp" style="font-family:corbel;color:black;font-size:"6"">ADD SERVICES</a></td>
</tr>
<tr>
<td><a href="viewservice.jsp" style="font-family:corbel;color:black;font-size:"6"">VIEW SERVICES</a></td>
</tr>
    <tr>
    <td><input type="submit" value="Logout" name="logout" id="logout"/></td></tr>
    </table>
  </form>
</div>


</body>
</html>



    