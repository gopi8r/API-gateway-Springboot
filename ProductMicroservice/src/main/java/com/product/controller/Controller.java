package com.product.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;

@RestController
public class Controller {

	
	 @GetMapping("/products")
	    public List<Product> getProducts() {
	        return Arrays.asList(
	            new Product(1, "Laptop"),
	            new Product(2, "Smartphone")
	        );
	    }
}
