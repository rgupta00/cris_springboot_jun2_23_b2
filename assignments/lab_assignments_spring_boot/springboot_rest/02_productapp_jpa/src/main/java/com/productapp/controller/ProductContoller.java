package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.entity.Product;
import com.productapp.service.ProductService;

//@RestController
//@RequestMapping(path = "api")
public class ProductContoller {

	private ProductService productService;

	@Autowired
	public ProductContoller(ProductService productService) {
		this.productService = productService;
	}

	// --------get all products-----------
	
	public List<Product> getAll() {
		return productService.getAll();
	}

	// --------get one product-----------
	
	public Product getAnProductById(int id) {
		return productService.getById(id);
	}

	// -------add one product-----------
	
	public Product addAnProduct(Product product) {
		return productService.addProduct(product);
	}
	
	//--------updated an product---------

	public Product updateAnProduct(int id,Product product ) {
		return productService.updateProduct(id, product);
	}
	
	
	public Product deleteAnProduct(int id ) {
		return productService.deleteProduct(id);
	}
	
}
