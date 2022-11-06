package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.CategoriaDAO;
import daos.LivroDAO;
import dtos.CategoriaDTO;
import dtos.LivroDTO;

@WebServlet("/ListaLivrosPorCategoria")
public class ListaLivrosPorCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<CategoriaDTO> categorias = new CategoriaDAO().getCategorias();
			request.setAttribute("categorias", categorias);
			request.getRequestDispatcher("listaLivrosPorCategoria.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("categoria");
		response.getWriter().println(param);
		
		try {
			ArrayList<LivroDTO> livros = new LivroDAO().getLivrosPorCategoria(param);
			request.setAttribute("livros", livros);
			request.getRequestDispatcher("livrosPorCategoria.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
