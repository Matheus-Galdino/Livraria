package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UsuarioDAO;
import dtos.UsuarioDTO;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<UsuarioDTO> alunos = new UsuarioDAO().getUsuarios();
			request.setAttribute("alunos", alunos);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
