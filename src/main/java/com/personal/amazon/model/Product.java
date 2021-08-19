package com.personal.amazon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "product")
@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String productName;
	private int productQuantity;
	private String productCategory;
	private float productPrice;
	
}
