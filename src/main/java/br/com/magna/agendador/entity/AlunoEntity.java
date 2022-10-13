package br.com.magna.agendador.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_ALUNOS")
public class AlunoEntity {

	private static final long serialVersionUID = -5770332701166440398L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUNO")
	private Integer id;

	@Column(nullable = false, length = 30, name = "NOME")
	private String nome;

	@Column(nullable = false, length = 30, name = "CPF")
	private String cpf;

	@Column(nullable = false, name = "SENHA")
	private String senha;

    public AlunoEntity(Integer id, String nome, String cpf, String senha) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
    }

	public AlunoEntity() {

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


}
