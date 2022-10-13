package br.com.magna.agendador.exception;

public class DeleteException extends RuntimeException {

	private static final long serialVersionUID = 626256445473980938L;

	public DeleteException(String message) {
		super(message);
	}

}
