package com.eduardo.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
