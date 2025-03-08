package com.codingshuttle.barsa.restapi;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingshuttle.barsa.restapi.entity.Product;

public interface TestH2Repository extends JpaRepository<Product, Integer>{

}
