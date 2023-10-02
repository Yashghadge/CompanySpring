package com.company.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Product {
   
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column
		private String brandName;
		@Column
		private String productName;
		@Column
		private double price;
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "category_id")
		private Category category;
}
