package br.com.magna.agendador.vo.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

	private String nome;
	private String senha;

	public String getEmail() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setEmail(String email) {
		this.nome = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(nome, senha);
	}

}
