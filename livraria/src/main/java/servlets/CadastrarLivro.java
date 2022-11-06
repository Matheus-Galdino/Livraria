package servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/CadastrarLivro")
public class CadastrarLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<CategoriaDTO> categorias = new CategoriaDAO().getCategorias();
			request.setAttribute("categorias", categorias);
			request.getRequestDispatcher("cadastrarLivro.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cod = Integer.parseInt(request.getParameter("cod"));
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String categoria = request.getParameter("categoria");
		double valor = Double.parseDouble(request.getParameter("valor"));
		
		LivroDTO livro = new LivroDTO();
		livro.setCodlivro(cod);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setCategoria(categoria);
		livro.setValor(valor);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			new LivroDAO().addLivro(livro);
			out.println("<p>Livro " + titulo + " cadastrado com sucesso!!</p>");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<p>Erro ao salvar, tente novamente!</p>");
		} finally {
			out.println("<a href='Home'>Voltar ao inicio</a>");
		}
	}

}
