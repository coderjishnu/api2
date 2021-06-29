package com.api2;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.api2.model.Product;
import com.api2.repository.ProductRepo;
import com.api2.service.ProductServiceImpl;

@SpringBootTest
public class Api2ServicesTests {

	@Autowired
	private ProductServiceImpl service;

	@MockBean
	private ProductRepo repository;
	
	
//	Date date = "20-10-2021";
//	
//	@Test
//	public void getProductByIdTest() {
//		String product = "pr1";
//		when(repository.findByProductId(product))
//				.thenReturn(Stream.of(new Product("pr1", "Rice", date ))));
//		assertEquals(1, service.getProductById(product).size());
//	}
//	
//	
//	@Test
//	public void addProductTest() {
//		when(repository.findAll())
//				.thenReturn(Stream.of(new Product("pr3","Wheat", date))
//						.collect(Collectors.toList()));
//		assertEquals(1, service.addProduct().size());
//	}
//
//	
//
//	@Test
//	public void updateProductTest() {
//		Product prdt = new Product("pr5","Potato", date);
//		when(repository.save(prdt)).thenReturn(prdt);
//		assertEquals(prdt, service.updateProduct(prdt));
//	}

	

	@Test
	public void deleteProductTest() {
		String prdt = "pr1";
		service.deleteProduct(prdt);		
		verify(repository, times(1)).deleteById(prdt);
	}

}