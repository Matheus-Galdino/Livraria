package dtos;

public class LivroDTO {
	private int codLivro;
	private String titulo;
	private String autor;
	private String categoria;
	private double valor;


	public int getCodlivro() {
		return codLivro;
	}

	public void setCodlivro(int codLivro) {
		this.codLivro = codLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
