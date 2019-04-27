

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
  @WebServlet("/servicefieldscontroller")
public class servicefieldscontroller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/jsp");
		PrintWriter out = response.getWriter();
		String SERVICE_ID = request.getParameter("SERVICE_ID");
		String SERVICE_NAME = request.getParameter("SERVICE_NAME");
		String PRICE = request.getParameter("PRICE");
		String DESCRIPTION = request.getParameter("DESCRIPTION");
		if(SERVICE_ID.isEmpty()||SERVICE_NAME.isEmpty()||PRICE.isEmpty()||DESCRIPTION.isEmpty())
        {
                        RequestDispatcher rd = request.getRequestDispatcher("servicedetails.jsp");
                        out.println("<font color=red>Please fill all the fields</font>");
                        rd.include(request, response);
        }
        else
        {

		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			// loads mysql driver
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SAI","hrs"); // create new connection with test database
			
			String query="insert into service values(?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(query);  // generates sql query
			
			ps.setString(1, SERVICE_ID);
			ps.setString(2,SERVICE_NAME);
			ps.setString(3, PRICE);
			ps.setString(4, DESCRIPTION);
		
			
			ps.executeUpdate(); // execute it on test database
		
			ps.close();
			con.close();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("successfuly inserted");
			RequestDispatcher rd = request.getRequestDispatcher("service created.jsp");
			rd.forward(request, response);
		}
	}
  }

