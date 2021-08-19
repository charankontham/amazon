package com.personal.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.amazon.service.IProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	@Qualifier("productService")
	private IProductService iproductService;
	
	
	@GetMapping
	public ResponseEntity<?> getProducts(){
		
		return new ResponseEntity<>(iproductService.getProducts(), HttpStatus.OK);
	}
	
}
