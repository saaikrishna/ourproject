<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome User</title>
<style>
body,html{
background-image:url("cool.jpg");width:100%;background-repeat:no-repeat;background-position:center; background-size: 1050px 1050px;}
#header{
height:15%;width:100%;font-family:arial;text-align:center;color:white;
}
#rightdiv{
height:85;width:60%;font-family:garamond;color:white;float:right;text-align:left;
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
<body>
<div id="header"><h2>Welcome Vendor</h2></div>
<div id="rightdiv">
  <form action="viewproductcontroller" method="post">
  <table style="text-align:center">
<tr>
<td><label for="product"><h3>Product</h3></label></td>
 <td><input type="text" id="product" name="product" placeholder="select.." required/></td>
</tr>
      <tr>
    <td><input type="submit" value="Submit" name="submit" id="submit"/></td>
    </tr>
   
    </table>
  </form>
</div>


</body>
</html>



    