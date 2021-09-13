package com.eduardo.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.couse.entities.OrderItem;

public interface OrderItemRepositorie extends JpaRepository<OrderItem, Long>{

}
