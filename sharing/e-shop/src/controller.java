

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDataServlet
 */
  @WebServlet("/Controller")
public class controller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/jsp");
		PrintWriter out = response.getWriter();
	
		String FIRST_NAME = request.getParameter("FIRST_NAME");
		String LAST_NAME = request.getParameter("LAST_NAME");
		String AGE = request.getParameter("AGE");
		String GENDER = request.getParameter("GENDER");
		String CONTACT_NUMBER = request.getParameter("CONTACT_NUMBER");
		String VENDOR_ID = request.getParameter("VENDOR_ID");
		String PASSWORD = request.getParameter("PASSWORD");
		
		if(FIRST_NAME.isEmpty()||LAST_NAME.isEmpty()||AGE.isEmpty()||GENDER.isEmpty()||CONTACT_NUMBER.isEmpty()|| VENDOR_ID.isEmpty()|| PASSWORD.isEmpty())
        {
                        RequestDispatcher rd = request.getRequestDispatcher("vendorform.jsp");
                        out.println("<font color=red>Please fill all the fields</font>");
                        rd.include(request, response);
        }
        else
        {

		
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			// loads mysql driver
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SAI", "hrs"); // create new connection with test database
			
			String query="insert into vendor values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(query);  // generates sql query
			
			ps.setString(1, FIRST_NAME);
			ps.setString(2,LAST_NAME);
			ps.setString(3, AGE);
			ps.setString(4, GENDER);
			ps.setString(5, CONTACT_NUMBER);
			ps.setString(6, VENDOR_ID);
			ps.setString(7, PASSWORD);
			
			
			ps.executeUpdate(); // execute it on test database
			
			ps.close();
			con.close();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("successfuly inserted");
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
	}
  }

