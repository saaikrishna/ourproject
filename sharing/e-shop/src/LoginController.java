import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("USER_ID");
		String pw=request.getParameter("PASSWORD");
		
		
		// Connect to mysql and verify username password
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SAI", "hrs"); // gets a new connection
 System.out.println(c);
		PreparedStatement ps = c.prepareStatement("Select ROLE from USER1 where USER_ID=? and PASSWORD=?");
		ps.setString(1, un);
		ps.setString(2, pw);
		
 System.out.println(ps);
		ResultSet rs = ps.executeQuery();
		
			if(rs.next()){
		
		       String type=rs.getString("ROLE");
		       System.out.println(type);
		       if("User".equalsIgnoreCase(type)){
		    	   RequestDispatcher rd = request.getRequestDispatcher("usercategory.jsp");
					rd.forward(request, response);
		      } 
		      else if("Vendor".equalsIgnoreCase(type)){
		    	  RequestDispatcher rd = request.getRequestDispatcher("choose.jsp");
					rd.forward(request, response);
		      }
		       
		}
			else
			{
				System.out.println("Invalid Credentials");
				RequestDispatcher rd = request.getRequestDispatcher("invalid.jsp");
        		rd.forward(request, response);
			}
		}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 


}
	}

