package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/dblivraria?useTimezone=true&serverTimezone=UTC", "root", "1234");
		
		connection.close();
		}
		catch(SQLException e) {
			throw new ServletException(e.getMessage());
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
