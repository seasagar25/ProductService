package com.shopping.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String productName);
}
