package com.example.assignment4.resource;


import com.example.assignment4.model.Photo;
import com.example.assignment4.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    //POST  methods
    @PostMapping
    public Photo savePhoto(@RequestBody @Valid Photo photo){
        return photoService.savePhoto(photo);
    }
    @GetMapping
    public List<Photo> getAllPhoto(){
        return photoService.getAllPhoto();
    }

    @GetMapping("/find")
    public Photo getPhotoById(@RequestParam("id")String id){
        return photoService.getPhotoById(id);
    }

    //PUT methods
    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }
    //DELETE methods
    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "id")String id){
          photoService.deletePhoto(id);
    }

}
