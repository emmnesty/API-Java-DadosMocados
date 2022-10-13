package br.com.magna.agendador.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class AlunoVO {

	private Integer id;

	@NotNull
	@NotEmpty
	@Length(min = 4)
	private String nome;

	@NotNull
	@NotEmpty
	@Length(min = 4)
	private String cpf;

	@NotNull
	@NotEmpty
	@Length(min = 4)
	private String senha;

	private int horasEstudadas;

	public AlunoVO() {

	}

	public AlunoVO(Integer id, String nome, String cpf, String senha, int horasEstudadas) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.horasEstudadas = horasEstudadas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getHorasEstudadas() {
		return horasEstudadas;
	}

	public void setHorasEstudadas(int horasEstudadas) {
		this.horasEstudadas = horasEstudadas;
	}

}
