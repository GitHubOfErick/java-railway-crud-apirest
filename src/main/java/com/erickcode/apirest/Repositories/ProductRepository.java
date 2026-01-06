package com.erickcode.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickcode.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
