package com.test.sprongboot.catalogo.controller;

import com.test.sprongboot.catalogo.repository.WishRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WishController {

    @Autowired
    private WishRepository repository;
    
}
