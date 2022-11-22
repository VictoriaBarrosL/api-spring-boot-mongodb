package com.victoriabarros.apirestmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.victoriabarros.apirestmongo.domain.User;
import com.victoriabarros.apirestmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Souza", "maria@gmail.com");
		User alex = new User(null, "Alex Silva", "alex@gmail.com");
		User joão = new User(null, "João Santos", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, joão));
	}

}
