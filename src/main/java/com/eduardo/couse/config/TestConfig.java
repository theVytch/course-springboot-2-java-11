package com.eduardo.couse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardo.couse.entities.Order;
import com.eduardo.couse.entities.User;
import com.eduardo.couse.repositories.OrderRepository;
import com.eduardo.couse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria Brown", "Maria@gmail.com","44997707755", "123456");
		User u2 = new User(null,"Alex Green", "Alex@gmail.com","4498875563", "123457");
		
		Order o1 = new Order(null, Instant.parse("2021-06-20T19:53:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2021-07-21T03:42:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2021-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
