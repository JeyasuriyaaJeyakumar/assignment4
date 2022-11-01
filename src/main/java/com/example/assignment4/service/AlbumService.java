package com.example.assignment4.service;


import com.example.assignment4.model.Album;
import com.example.assignment4.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }
    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }
    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }


    public void deleteAlbum(String id) {
          albumRepository.deleteById(id);
    }

    public Album getAlbumById(String id) {
        return albumRepository.findById(id).get();
    }

}
