package dtos;

public class UsuarioDTO {
	private int login;
	private String nome;
	
	public int getLogin() {
		return login;
	}
	
	public void setLogin(int login) {
		this.login = login;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "RM: " + getLogin() + ", Nome: " + getNome() + "\n";
	}
}
