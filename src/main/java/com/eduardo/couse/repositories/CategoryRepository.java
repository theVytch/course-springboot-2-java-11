package com.eduardo.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
