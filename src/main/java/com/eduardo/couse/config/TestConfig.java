package com.eduardo.couse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardo.couse.entities.Category;
import com.eduardo.couse.entities.Order;
import com.eduardo.couse.entities.User;
import com.eduardo.couse.entities.enums.OrderStatus;
import com.eduardo.couse.repositories.CategoryRepository;
import com.eduardo.couse.repositories.OrderRepository;
import com.eduardo.couse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		
		User u1 = new User(null,"Maria Brown", "Maria@gmail.com","44997707755", "123456");
		User u2 = new User(null,"Alex Green", "Alex@gmail.com","4498875563", "123457");
		
		Order o1 = new Order(null, Instant.parse("2021-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2021-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMEN, u2); 
		Order o3 = new Order(null, Instant.parse("2021-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMEN, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
