package com.example.assignment4.repository;


import com.example.assignment4.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository <User, String> {
    List<User> findAllByName(String name);

}
