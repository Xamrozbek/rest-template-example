package com.example.restapiexample.service;

import com.example.restapiexample.model.PhotoItem;

import java.util.List;

public interface ApiService {
    List<PhotoItem> getPhotos();
}
