<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Product Details</title>
<style>
body,html{
background-image:url("1.jpg");}
#header{
height:15%;width:100%;font-family:arial;text-align:center;color:white;
}
#rightdiv{
height:85;width:60%;font-family:garamond;color:white;float:right;text-align:left;
}

input[type=text], select {
  width: 100%;
  background-color: white;
  padding: 5px 5px;
  margin: 4px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 8px;
  box-sizing: border-box;
}

input[type=number], select {
  width: 100%;
  background-color: white;
  padding: 5px 5px;
  margin: 4px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 8px;
  box-sizing: border-box;
}

input[type=password], select {
  width:100%;
  background-color: white;
  padding: 5px 5px;
  margin: 4px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 8px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: white;
  color: white;
  padding: 5px 5px;
  margin: 4px 0;
  border: none;
  border-radius: 8px;
  cursor: pointer;
}

input[type=submit]{
  background-color: aqua;
}

</style>
</head>
<body>
<div id="header"><h2> New Product </h2></div>
<div id="rightdiv">
  <form method="post" action="productfieldscontroller">
  <table style="text-align:center">
  <tr>
    <td><label for="productid"><h3>Product Id</h3></label></td>
    <td><input type="number" id="PRODUCT_ID" name="PRODUCT_ID" placeholder="Your Product id.." required/></td>
</tr>
<tr>
    <td><label for="productname"><h3>Product Name</h3></label></td>
    <td><input type="text" id="PRODUCT_NAME" name="PRODUCT_NAME" placeholder="Your Product name.." required/></td>
    </tr>
    <tr>
     <td><label for="price"><h3>Price Rs.</h3></label></td>
    <td><input type="number" id="PRICE" name="PRICE" placeholder="Product price.." required/></td>
</tr>
<tr>
    <td><label for="productdescription"><h3>Product Description</h3></label></td>
    <td><textarea name="DESCRIPTION" rows="4" cols="50"></textarea></td>
    </tr>

  <tr>
    <td><a href="created.jsp"><input type="submit" value="Submit" name="submit" id="submit"/></a></td>
    </tr>
    </table>
  </form>
</div>


</body>
</html>
    