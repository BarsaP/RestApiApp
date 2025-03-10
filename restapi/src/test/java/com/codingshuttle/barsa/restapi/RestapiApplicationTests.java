package com.codingshuttle.barsa.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.codingshuttle.barsa.restapi.entity.Product;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestapiApplicationTests {

	@LocalServerPort
	private int port;
	
	
	private String baseUrl = "http://localhost";
	
	private static RestTemplate restTemplate;
	
	@Autowired
	private TestH2Repository h2Repository;
	
	@BeforeAll
	public static void init() {
		restTemplate = new RestTemplate();
	}
	
	@BeforeEach
    public void setUp() {
		h2Repository.deleteAll();
		baseUrl = baseUrl.concat(":").concat(port+"").concat("/api/products");
	}
	
	@Test
	public void testAddProduct() {
		int initialCount = h2Repository.findAll().size();
		
		Product product = new Product("headset", 2.0, 7999);
		Product response = restTemplate.postForObject(baseUrl, product,Product.class);
		assertEquals("headset", response.getName());
		assertEquals(1, h2Repository.findAll().size());
	}

}
