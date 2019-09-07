package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer>{


}
