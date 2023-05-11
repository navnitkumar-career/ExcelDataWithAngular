package com.example.apigatway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.apigatway.entity.Product;
import com.example.apigatway.helper.ExcelHelper;
import com.example.apigatway.repo.ProductRepo;

@Service
public class Productservice {
	
	@Autowired
	ProductRepo productRepo;

	public void save(MultipartFile file) {
		try {
			List<Product> products = ExcelHelper.convertExcelToListOfProduct(file.getInputStream());
			this.productRepo.saveAll(products);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Product> getAllProduct() {
		return this.productRepo.findAll();
	}
	
}
