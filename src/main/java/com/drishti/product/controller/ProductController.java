package com.drishti.product.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.drishti.product.dto.ProductRequest;
import com.drishti.product.model.Product;
import com.drishti.product.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
	
	private final ProductService productService;
		
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String createProduct(@RequestBody ProductRequest productReq) {
		productService.createProduct(productReq);
		return "Product is created";
		
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> getProduct(){
		return productService.getProducts();
		
	}
	
	@GetMapping("/test")
	@ResponseStatus(HttpStatus.OK)
	public String createProduct() {
		return "HI";
		
	}

}
