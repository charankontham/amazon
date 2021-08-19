package com.personal.amazon.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.amazon.model.Product;
import com.personal.amazon.repository.IProductRepository;

@Service("productService")
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository iProductRepository;
	
	@PostConstruct
	public void init() {
		Product product = new Product();
		product.setProductCategory("Electronics");
		product.setProductName("Mobile");
		product.setProductPrice(1000);
		product.setProductQuantity(10);
		iProductRepository.save(product);
	}
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return iProductRepository.findAll();
	}
	
}
