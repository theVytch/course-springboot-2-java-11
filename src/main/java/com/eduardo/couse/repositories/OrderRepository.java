package com.eduardo.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
