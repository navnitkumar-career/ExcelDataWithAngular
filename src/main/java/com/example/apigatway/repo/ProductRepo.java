package com.example.apigatway.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apigatway.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	

}
