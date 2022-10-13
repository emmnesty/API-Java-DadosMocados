//package br.com.magna.agendador.controller;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import br.com.magna.agendador.vo.AlunoVO;
//
//@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class AlunoControllerTest {
//
//	static final String URL = "http://localhost:8080/aluno";
//	
//	private static final String PATH_ALUNO = "/aluno";
//	private static StringBuilder path = new StringBuilder(URL);
//	private static final String NOME_ALUNO = "Cachorro";
//	private static final String CPF = "1234";
//	private static final String SENHA = "$2a$05$qzEIx52ohXiYKoW4KxFWeeViTVpzoo24WiTmfgSU5khtmO7MKN9q2";
//	
//	
//	@Autowired
//	private TestRestTemplate restTemplate;
//
//	@Test
//	@Order(1)
//	void gerandoConsultaParaTestarListandoPorId() throws URISyntaxException {
//		URI uri = new URI(URL + "/1");
//
//		ResponseEntity<AlunoVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.GET, null, AlunoVO.class);
//
//		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//	}
//
//	@Test
//	@Order(2)
//	void gerandoConsultaParaTestarListandoPorTodos() throws URISyntaxException {
//
//		URI uri = new URI(URL);
//		ResponseEntity<AlunoVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.GET, null, AlunoVO.class);
//
//		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//
//	}
//
//	@Test
//	@Order(3)
//	void gerandoAlunoParaTestarSalvando() throws URISyntaxException {
//		URI uri = new URI(URL);
//		AlunoVO vo = new AlunoVO();
//		vo.setNome("Batman da Silva");
//		vo.setCpf("123.456.789-10");
//		vo.setSenha("1234");
//
//		HttpEntity<AlunoVO> entity = new HttpEntity<AlunoVO>(vo);
//		ResponseEntity<AlunoVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.POST, entity,
//				AlunoVO.class);
//
//		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
//	}
//
//	@Order(4)
//	@Test
//	void gerandoAlunoParaTestarAtualizando() throws URISyntaxException {
//		URI uri = new URI(URL + "/7");
//		AlunoVO vo = new AlunoVO();
//		vo.setId(7);
//		vo.setNome("Batman da Silva");
//		vo.setCpf("123.456.789-10");
//		vo.setSenha("1234");
//
//		HttpEntity<AlunoVO> entity = new HttpEntity<AlunoVO>(vo);
//
//		ResponseEntity<AlunoVO> response = restTemplate.exchange(uri, HttpMethod.PUT, entity,
//				AlunoVO.class);
//
//		assertEquals(HttpStatus.CREATED, response.getStatusCode());
//	}
//
//	@Order(5)
//	@Test
//	void gerandoAlunoParaTestarDeletando() throws URISyntaxException {
//		URI uri = new URI(URL);
//
//		ResponseEntity<String> response = restTemplate.exchange(uri + "/12", HttpMethod.DELETE, null, String.class);
//
//		assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//
//	}
//	
//	public AlunoVO gerarVOSalvar() {
//
//		AlunoVO vo = new AlunoVO();
//
//		vo.setNome(NOME_ALUNO);
//		vo.setCpf(CPF);
//		vo.setSenha(SENHA);
//
//		return vo;
//
//	}
//	
////	@BeforeEach
////	void inicializar() {
////		path.append(PATH_ALUNO);
////	}
////	
////	@AfterEach
////	void finalizar() {
////		path = new StringBuilder(URL);
////	}	
//
//}
