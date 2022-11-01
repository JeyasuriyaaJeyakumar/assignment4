package com.example.assignment4.repository;

import com.example.assignment4.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String> {

    List<Album> findAllById(String id);
}
