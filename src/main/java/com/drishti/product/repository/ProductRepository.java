package com.drishti.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drishti.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
