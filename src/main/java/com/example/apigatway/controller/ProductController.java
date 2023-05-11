package com.example.apigatway.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.apigatway.entity.Product;
import com.example.apigatway.helper.ExcelHelper;
import com.example.apigatway.service.Productservice;

import lombok.experimental.Helper;

@RestController
@CrossOrigin("*")
public class ProductController {

	@Autowired
	Productservice productservice; 
	
	@PostMapping("/product/upload")
	public ResponseEntity<?> upload(@RequestParam ("file")MultipartFile file ){
		
		if(ExcelHelper.checkExcelFormat(file)) {
			this.productservice.save(file);
			return ResponseEntity.ok(Map.of("message","File is sucessfully uploaded"));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file");	
	}
	
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return this.productservice.getAllProduct();
	}
	
}
