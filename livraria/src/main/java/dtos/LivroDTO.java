package dtos;

public class LivroDTO {
	private int codlivro;
	private String titulo;
	private String autor;
	private String categoria;
	private double valor;


	public int getCodlivro() {
		return codlivro;
	}

	public void setCodlivro(int codlivro) {
		this.codlivro = codlivro;
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
