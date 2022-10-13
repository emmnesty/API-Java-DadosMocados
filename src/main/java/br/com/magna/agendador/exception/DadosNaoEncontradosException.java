package br.com.magna.agendador.exception;

public class DadosNaoEncontradosException extends RuntimeException{

	private static final long serialVersionUID = -8049194336787088415L;

	public DadosNaoEncontradosException(String message) {
		super(message);
	}

}
