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
//import br.com.magna.agendador.vo.InstituicaoVO;
//
//@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class InstituicaoControllerTest {
//
//	static final String URL = "http://localhost:8080/instituicoes";
//
//	@Autowired
//	private TestRestTemplate restTemplate;
//
//	@Test
//	@Order(1)
//	void gerandoConsultaParaTestarListandoPorId() throws URISyntaxException {
//		URI uri = new URI(URL + "/1");
//
//		ResponseEntity<InstituicaoVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.GET, null,
//				InstituicaoVO.class);
//
//		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//	}
//
//	@Test
//	@Order(2)
//	void gerandoConsultaParaTestarListandoPorTodos() throws URISyntaxException {
//
//		URI uri = new URI(URL);
//		ResponseEntity<InstituicaoVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.GET, null,
//				InstituicaoVO.class);
//
//		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//
//	}
//
//	@Test
//	@Order(3)
//	void gerandoInstituicaoParaTestarSalvando() throws URISyntaxException {
//		URI uri = new URI(URL);
//		InstituicaoVO vo = new InstituicaoVO();
//		vo.setNome("jkdfkjfkljddfjlk");
//		vo.setCnpj("123456789");
//
//		HttpEntity<InstituicaoVO> entity = new HttpEntity<InstituicaoVO>(vo);
//		ResponseEntity<InstituicaoVO> responseEntity = this.restTemplate.exchange(uri, HttpMethod.POST, entity,
//				InstituicaoVO.class);
//
//		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
//	}
//
//	@Test
//	@Order(4)
//	void gerandoInstituicaoParaTestarAtualizando() throws URISyntaxException {
//		URI uri = new URI(URL + "/8");
//		InstituicaoVO vo = new InstituicaoVO();
//		vo.setId(8);
//		vo.setNome("Uninove");
//		vo.setCnpj("654987321/0007");
//
//		HttpEntity<InstituicaoVO> entity = new HttpEntity<InstituicaoVO>(vo);
//
//		ResponseEntity<InstituicaoVO> response = restTemplate.exchange(uri, HttpMethod.PUT, entity,
//				InstituicaoVO.class);
//
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//	}
//
//	@Order(5)
//	@Test
//	void gerandoInstituicaoParaTestarDeletando() throws URISyntaxException {
//		URI uri = new URI(URL);
//
//		ResponseEntity<String> response = restTemplate.exchange(uri + "/4", HttpMethod.DELETE, null, String.class);
//
//		assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
//
//	}
//
//}
