package com.example.restapiexample.service.impl;

import com.example.restapiexample.service.ApiService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApiServiceImplTest {
    @Autowired
    private ApiService apiService;

    @Test
    void getPhotos() {

        var data = apiService.getPhotos();
        var count = data.stream()
                .filter(photoItem -> photoItem.getTitle().startsWith("a"))
                .count();
        System.out.println(count);
        assertEquals(5000, data.size());

    }
}