package com.shreerajtech.crud.example.repository;

import com.shreerajtech.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Product findByName(String name);
}
