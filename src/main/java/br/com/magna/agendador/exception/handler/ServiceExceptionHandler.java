package br.com.magna.agendador.exception.handler;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.magna.agendador.exception.AlunoCadastradoException;
import br.com.magna.agendador.exception.DadosNaoEncontradosException;
import br.com.magna.agendador.exception.DeleteException;
import br.com.magna.agendador.exception.DisciplinaCadastradaException;
import br.com.magna.agendador.exception.InstituicaoCadastradaException;
import br.com.magna.agendador.vo.ResponseExceptionVO;

@ControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {

	private static final String HEADER_MESSAGE = "mensagem";
	private static final LocalDate DATE = LocalDate.now();
	private static final String ALUNO_JA_CADASTRADO = "Aluno já cadastrado";
	private static final String DISCIPLINA_CADASTRADA = "Disciplina já cadastrada";
	private static final String INSTITUICAO_CADASTRADA = "Instituição já cadastrada";
	private static final String NAO_ENCONTRADO = "Não encontrado";
	private static final String DELETE = "ID não localizado";

	private static final HttpStatus BAD_REQUEST = HttpStatus.BAD_REQUEST;

	@ExceptionHandler(DadosNaoEncontradosException.class)
	public ResponseEntity<Object> dadosNaoEncontradosExceptionHandler(DadosNaoEncontradosException e,
			ServletWebRequest request) {

		ResponseExceptionVO response = criarExceptionResponseVO(DATE, NAO_ENCONTRADO, Arrays.asList(e.getMessage()),
				request.getRequest().getRequestURI());

		HttpHeaders header = new HttpHeaders();
		header.add(HEADER_MESSAGE, e.getMessage());

		return handleExceptionInternal(e, response, header, BAD_REQUEST, request);
	}

	@ExceptionHandler(AlunoCadastradoException.class)
	public ResponseEntity<Object> alunoJaCadastradoExceptionHandler(AlunoCadastradoException e,
			ServletWebRequest request) {

		ResponseExceptionVO response = criarExceptionResponseVO(DATE, ALUNO_JA_CADASTRADO,
				Arrays.asList(e.getMessage()), request.getRequest().getRequestURI());

		HttpHeaders header = new HttpHeaders();
		header.add(HEADER_MESSAGE, e.getMessage());

		return handleExceptionInternal(e, response, header, BAD_REQUEST, request);
	}

	@ExceptionHandler(DisciplinaCadastradaException.class)
	public ResponseEntity<Object> disciplinaJaCadastradoExceptionHandler(DisciplinaCadastradaException e,
			ServletWebRequest request) {

		ResponseExceptionVO response = criarExceptionResponseVO(DATE, DISCIPLINA_CADASTRADA,
				Arrays.asList(e.getMessage()), request.getRequest().getRequestURI());

		HttpHeaders header = new HttpHeaders();
		header.add(HEADER_MESSAGE, e.getMessage());

		return handleExceptionInternal(e, response, header, BAD_REQUEST, request);
	}

	@ExceptionHandler(InstituicaoCadastradaException.class)
	public ResponseEntity<Object> instituicaoJaCadastradoExceptionHandler(InstituicaoCadastradaException e,
			ServletWebRequest request) {

		ResponseExceptionVO response = criarExceptionResponseVO(DATE, INSTITUICAO_CADASTRADA,
				Arrays.asList(e.getMessage()), request.getRequest().getRequestURI());

		HttpHeaders header = new HttpHeaders();
		header.add(HEADER_MESSAGE, e.getMessage());

		return handleExceptionInternal(e, response, header, BAD_REQUEST, request);
	}

	@ExceptionHandler(DeleteException.class)
	public ResponseEntity<Object> deleteExceptionHandler(DeleteException e, ServletWebRequest request) {

		ResponseExceptionVO response = criarExceptionResponseVO(DATE, DELETE, Arrays.asList(e.getMessage()),
				request.getRequest().getRequestURI());

		HttpHeaders header = new HttpHeaders();
		header.add(HEADER_MESSAGE, e.getMessage());

		return handleExceptionInternal(e, response, header, BAD_REQUEST, request);
	}

	private ResponseExceptionVO criarExceptionResponseVO(LocalDate date, String title, List<String> detail,
			String instance) {
		ResponseExceptionVO exception = new ResponseExceptionVO();
		exception.setDetail(detail);
		exception.setInstance(instance);
		exception.setTitle(title);
		exception.setTimestamp(date);

		return exception;
	}

}
