package com.example.demo.service;

import com.example.demo.model.Product;

public interface ProductService {
	public Product getProductById(String productId);
	public Product addProduct(Product product);
	
}
