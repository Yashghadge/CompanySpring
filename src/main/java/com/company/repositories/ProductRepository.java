package com.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
