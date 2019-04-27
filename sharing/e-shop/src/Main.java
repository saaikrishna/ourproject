import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/Main")
public class Main extends HttpServlet {

	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String vendor_id=request.getParameter("category");
		//int ud=Integer.valueOf(vendor_id);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SAI","hrs");
			
			PreparedStatement ps=con.prepareStatement("select vendor_id,first_name,last_name,age,gender,contact,address,city,zip_code,landline,Email,category from new1 where category=?");
			ps.setString(1, vendor_id);
		
		
			System.out.println(vendor_id);
			
			
			out.print("<table style='width:100%; border:1; font-family:helvetica;'>");
			out.print("<caption><h1><b> Report </b></h1></caption>");
			ResultSet rs=ps.executeQuery();
			
			/* Printing column names */
			ResultSetMetaData rsmd=rs.getMetaData();
			int total=rsmd.getColumnCount();
			out.print("<tr >");
			for(int i=1;i<=total;i++)
			{
				out.print("<th style='background-color:green ;color:white;'>"+rsmd.getColumnName(i)+"</th>");
				
			}
			out.print("</tr>");
			
			/* Printing result */
			while(rs.next())
			{
				out.print("<tr style='text-align:center'><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td>+<td>"+rs.getString(12)+"</td></tr>");
				
			}
			out.print("</table>");
			out.println("<br><br><a href='usercategory.jsp'>BACK</a>");
			 out.println("<br><br><a href='home.jsp'>LOGOUT</a>");


			 
		
			
		}catch (Exception e2) {e2.printStackTrace();}
		
		finally{out.close();}
	
		
	}

}
