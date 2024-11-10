package com.drishti.product.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.drishti.product.dto.ProductRequest;
import com.drishti.product.model.Product;
import com.drishti.product.repository.ProductRepository;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@Component
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;

	public void createProduct(ProductRequest productReq) {
		Product productEntity = Product.builder().productName(productReq.getProductName())
				.productDescription(productReq.getProductDescription())
				.price(productReq.getPrice())
				.build();
		productRepository.save(productEntity);
		
		
		 
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

}
