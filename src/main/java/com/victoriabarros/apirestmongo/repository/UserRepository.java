package com.victoriabarros.apirestmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.victoriabarros.apirestmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
