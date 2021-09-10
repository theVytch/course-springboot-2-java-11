package com.eduardo.couse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardo.couse.entities.User;
import com.eduardo.couse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria Brown", "Maria@gmail.com","44997707755", "123456");
		User u2 = new User(null,"Alex Green", "Alex@gmail.com","4498875563", "123457");
	
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
