package dtos;

public class UsuarioDTO {
	private int login;
	private String senha;
	private String nome;
	
	public int getLogin() {
		return login;
	}
	
	public void setLogin(int login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
