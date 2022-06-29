package com.spring.usersms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.usersms.model.UserModel;


public interface UserRepo extends MongoRepository<UserModel, Integer> {
}
