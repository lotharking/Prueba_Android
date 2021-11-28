package com.test.sprongboot.catalogo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.test.sprongboot.catalogo.entity.Product;
import com.test.sprongboot.catalogo.repository.ProductRepository;

// import org.h2.util.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductController {

  @Autowired
  private ProductRepository repository;

  
  @GetMapping(path = "/lista")
  public String list(){
   
    List<Product> list = new ArrayList<>();
    repository.findAll().forEach(list::add);

    return list.toString();
    // return "Hello world";
  }
}