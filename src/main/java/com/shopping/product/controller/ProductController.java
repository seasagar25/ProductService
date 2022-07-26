package com.shopping.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.product.entity.Product;
import com.shopping.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService services;
	
	@GetMapping("/productById/{id}")
	public Product getProductById(@PathVariable int id) {
		return services.getProductById(id);
	}
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return services.getAllProduct();
		
	}
	@GetMapping("/product/{name}")
	public Product getProductByName(@PathVariable String name) {
		return services.getProductByName(name);
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return services.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addAllProducts(@RequestBody List<Product> productList){
		return services.saveAllProducts(productList);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return services.deleteProduct(id);
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return services.updateProduct(product);
	}
}
