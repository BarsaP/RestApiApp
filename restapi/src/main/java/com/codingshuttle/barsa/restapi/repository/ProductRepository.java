package com.codingshuttle.barsa.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingshuttle.barsa.restapi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
