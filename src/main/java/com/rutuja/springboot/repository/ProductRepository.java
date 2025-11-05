package com.rutuja.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rutuja.springboot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}