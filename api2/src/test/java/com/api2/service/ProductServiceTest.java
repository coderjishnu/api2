//package com.api2.service;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.sql.Date;
//import java.time.LocalDate;
//import java.util.Optional;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.api2.model.Product;
//import com.api2.repository.ProductRepoTest;
//import com.api2.schema.ProductResponseTest;
//import com.api2.schema.Response;
//import com.api2.schema.ResponseTest;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class ProductServiceTest {
//
//	@Autowired
//	private ProductService service;
//
//
//	@MockBean
//	private ProductRepoTest repository;
//
//	Product product;
//	ResponseTest response;
//	ProductResponseTest productResponse;
//
//	private ProductResponseTest getProductResponse(Product product) {
//		ProductResponseTest productResponse = new ProductResponseTest();
//		productResponse.setId(product.getId());
//		productResponse.setProductExpiryDate(product.getProductExpiryDate());
//		productResponse.setProductId(product.getProductId());
//		productResponse.setProductName(product.getProductName());
//		return productResponse;
//
//	}
//
//	@BeforeEach
//	public void setUp() {
//		product = new Product();
//		product.setId(1);
//		product.setProductId("G1");
//		product.setProductName("Noodles");
//		product.setProductExpiryDate(Date.valueOf(LocalDate.now()));
//
//		response = new ResponseTest();
//		response.setResponseType("SUCCESS");
//		response.setResponseMessage("NOT EXPIRED");
//		response.setProductResponse(this.getProductResponse(product));
//	}
//
//	@Test
//	public void getProductByIdTest() {
//
//
//		doReturn(Optional.of(product)).when(repository).findByProductId("G1");
//		Response productResponse = service.getProductById("G1");
//		verify(repository, times(1)).findByProductId("G1");
//		
//		assertTrue(repository.findByProductId("G1").isPresent());
//		assertNotNull(productResponse);
//		assertEquals("NOT EXPIRED", productResponse.getResponseMessage());
//	}
//
//	@Test
//	public void addProductTest() {
//		response.setResponseMessage("PRODUCT SAVED");
//		when(repository.findByProductId(product.getProductId())).thenReturn(Optional.empty());
//		when(repository.save(product)).thenReturn(product);
//		Response productResponse = service.addProduct(product);
//		assertNotNull(productResponse);
//		assertEquals("PRODUCT SAVED", productResponse.getResponseMessage());
//	}
//
//	@Test
//	public void updateProductTest() {
//		product.setProductName("Burger");
//		response.setResponseMessage("PRODUCT UPDATED");
//		response.setProductResponse(this.getProductResponse(product));
//		when(repository.findByProductId(product.getProductId())).thenReturn(Optional.of(product));
//		when(repository.save(product)).thenReturn(product);
//		Response productResponse = service.updateProduct(product);
//		assertNotNull(productResponse);
//		assertEquals("PRODUCT UPDATED", productResponse.getResponseMessage());
//	}
//
//	@Test
//	public void deleteProductTest() {
//		response.setResponseType("FAILED");
//		response.setResponseMessage("PRODUCT NOT EXPIRED");
//		response.setProductResponse(null);
//		when(repository.findByProductId(product.getProductId())).thenReturn(Optional.of(product));
//		Response productResponse = service.deleteProduct(product.getProductId());
//		assertNotNull(productResponse);
//		assertEquals("PRODUCT NOT EXPIRED", productResponse.getResponseMessage());
//	}
//}
