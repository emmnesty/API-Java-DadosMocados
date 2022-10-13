//package br.com.magna.agendador.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//
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
//import br.com.magna.agendador.vo.DisciplinasVO;
//
//@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class DisciplinasControllerTest {
//
//	static final String URL = "http://localhost:8080/disciplinas";
//
//	@Autowired
//	private TestRestTemplate restTemplate;
//
//	@Test
//	@Order(1)
//	void gerandoConsultaParaTestarListandoPorId() throws URISyntaxException {
//		URI uri = new URI(URL + "/1");
//
//		ResponseEntity<DisciplinasVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.GET, null,
//				DisciplinasVO.class);
//
//		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//	}
//
//	@Test
//	@Order(2)
//	void gerandoConsultaParaTestarListandoPorTodos() throws URISyntaxException {
//
//		URI uri = new URI(URL);
//		ResponseEntity<DisciplinasVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.GET, null,
//				DisciplinasVO.class);
//
//		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//
//	}
//
//	@Test
//	@Order(3)
//	void gerandoDisciplinaParaTestarSalvando() throws URISyntaxException {
//		URI uri = new URI(URL);
//		DisciplinasVO vo = new DisciplinasVO();
//		vo.setNome("jkdfkjfkljddfjlk");
//
//		HttpEntity<DisciplinasVO> entity = new HttpEntity<DisciplinasVO>(vo);
//		ResponseEntity<DisciplinasVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.POST, entity,
//				DisciplinasVO.class);
//
//		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
//	}
//
//	@Test
//	@Order(4)
//	void gerandoDisciplinaParaTestarAtualizando() throws URISyntaxException {
//		URI uri = new URI(URL + "/7");
//		DisciplinasVO vo = new DisciplinasVO();
//		vo.setId(7);
//		vo.setNome("teste");
//
//		HttpEntity<DisciplinasVO> entity = new HttpEntity<DisciplinasVO>(vo);
//
//		ResponseEntity<DisciplinasVO> response = restTemplate.exchange(uri, HttpMethod.PUT, entity,
//				DisciplinasVO.class);
//
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//	}
//
//	@Order(5)
//	@Test
//	void gerandoDisciplinaParaTestarDeletando() throws URISyntaxException {
//		URI uri = new URI(URL);
//
//		ResponseEntity<String> response = restTemplate.exchange(uri + "/7", HttpMethod.DELETE, null, String.class);
//
//		assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//
//	}
//
//}
