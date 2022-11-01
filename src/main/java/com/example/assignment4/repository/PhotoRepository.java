package com.example.assignment4.repository;


import com.example.assignment4.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo, String> {

    List<Photo> findAllById(String id);
}
