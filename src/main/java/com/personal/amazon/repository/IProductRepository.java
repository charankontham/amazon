package com.personal.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.amazon.model.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{

}
