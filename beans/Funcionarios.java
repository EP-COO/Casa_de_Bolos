package beans;

import java.lang.String;

public class Funcionarios extends Pessoa{
	
	private String login;
	private String senha;
	
	//Construtor
	public Funcionarios(String nome, String login, String senha) {
		setNome(nome);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}