package com.victoriabarros.apirestmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victoriabarros.apirestmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
	List<User> list = new ArrayList<>();
	User maria = new User("1001", "Maria silva", "maria@gmail.com");
	User alex = new User("1002", "Alex Souza", "alex@gmail.com");
	list.addAll(Arrays.asList(maria, alex));
	return ResponseEntity.ok().body(list);
	}
	
}
