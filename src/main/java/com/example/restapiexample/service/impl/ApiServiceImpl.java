package com.example.restapiexample.service.impl;

import com.example.restapiexample.model.PhotoItem;
import com.example.restapiexample.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {


    private final RestTemplate restTemplate;


    @Override
    public List<PhotoItem> getPhotos() {
        var data = restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos", PhotoItem[].class);
        return List.of(data);
    }
}
