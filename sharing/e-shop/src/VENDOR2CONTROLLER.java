

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
  @WebServlet("/VENDOR2CONTROLLER")
public class VENDOR2CONTROLLER extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/jsp");
		PrintWriter out = response.getWriter();
		String VENDOR_ID = request.getParameter("VENDOR_ID");
		String FIRST_NAME = request.getParameter("FIRST_NAME");
		String LAST_NAME = request.getParameter("LAST_NAME");
		String AGE = request.getParameter("AGE");
		String GENDER = request.getParameter("GENDER");
		String CONTACT_NUMBER = request.getParameter("CONTACT_NUMBER");
		String ADDRESS = request.getParameter("ADDRESS");
		String CITY = request.getParameter("CITY");
		String ZIPCODE = request.getParameter("ZIPCODE");
		String LANDLINE = request.getParameter("LANDLINE");
		String EMAIL = request.getParameter("EMAIL");
		String CATEGORY = request.getParameter("CATEGORY");
		
		if(VENDOR_ID.isEmpty()||FIRST_NAME.isEmpty()||LAST_NAME.isEmpty()||AGE.isEmpty()||GENDER.isEmpty()||CONTACT_NUMBER.isEmpty()|| ADDRESS.isEmpty()|| CITY.isEmpty() || ZIPCODE.isEmpty() || LANDLINE.isEmpty() || EMAIL.isEmpty() || CATEGORY.isEmpty())
        {
                        RequestDispatcher rd = request.getRequestDispatcher("updatedetailsvendor.jsp");
                        out.println("<font color=red>Please fill all the fields</font>");
                        rd.include(request, response);
        }
        else
        {
		
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			// loads mysql driver
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SAI", "hrs"); // create new connection with test database
			
			String query="insert into new1 values(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(query);  // generates sql query
			ps.setString(1, VENDOR_ID);
			ps.setString(2, FIRST_NAME);
			ps.setString(3,LAST_NAME);
			ps.setString(4, AGE);
			ps.setString(5, GENDER);
			ps.setString(6, CONTACT_NUMBER);
			ps.setString(7, ADDRESS );
			ps.setString(8, CITY );
			ps.setString(9, ZIPCODE);
			ps.setString(10, LANDLINE);
			ps.setString(11, EMAIL);
			ps.setString(12, CATEGORY);
			
			
			
			ps.executeUpdate(); // execute it on test database
			ps.close();
			con.close();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("successfuly inserted");
			RequestDispatcher rd = request.getRequestDispatcher("completed.jsp");
			rd.forward(request, response);
		}
	}
  }

