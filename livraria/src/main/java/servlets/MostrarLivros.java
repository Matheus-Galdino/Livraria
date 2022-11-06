package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.LivroDAO;
import dtos.LivroDTO;

@WebServlet("/MostrarLivros")
public class MostrarLivros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("mostrarLivros.jsp");;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("cod");
		int cod = Integer.parseInt(param);
		try {
			LivroDTO livro = new LivroDAO().getLivroPorCodigo(cod);
			request.setAttribute("livro", livro);
			request.setAttribute("cod", livro.getCodlivro());
			request.getRequestDispatcher("detalhesLivro.jsp").forward(request, response);
		} catch (Exception e) {			
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("Livro com código: " + cod + " não existe");
		}
	}
}
