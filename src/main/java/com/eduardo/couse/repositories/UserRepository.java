package com.eduardo.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
