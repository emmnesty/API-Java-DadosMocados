package br.com.magna.agendador.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "TB_ALUNOS")
public class AlunoEntity {

	private static final long serialVersionUID = -5770332701166440398L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALUNO")
	private Integer id;

//	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
//	private List<InstituicaoEntity> instituicao;
//
//	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
//	private List<DisciplinasEntity> disciplina;

	@Column(nullable = false, length = 30, name = "NOME")
	private String nome;

	@Column(nullable = false, length = 30, name = "CPF")
	private String cpf;

	@Column(nullable = false, name = "SENHA")
	private String senha;

//	@Column( length = 30, name = "HORAS_ESTUDADAS")
//	private Integer horasEstudadas;

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

//	public int getHorasEstudadas() {
//		return horasEstudadas;
//	}
//
//	public void setHorasEstudadas(int horasEstudadas) {
//		this.horasEstudadas = horasEstudadas;
//	}

//	@Override
//	public String getPassword() {
//		return this.senha;
//	}
//
//	@Override
//	public String getUsername() {
//		return this.nome;
//	}

//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return null;
//	}

}
