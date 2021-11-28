package com.test.sprongboot.catalogo.controller;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.stream.Stream;

import com.test.sprongboot.catalogo.entity.Product;
import com.test.sprongboot.catalogo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  // @GetMapping(path = "/api/hello-world")
  // public String helloWorld(){
  //   return "Hello world!";
  // }
  @Autowired
  private ProductRepository repository;

  
  @GetMapping(path = "/api/hello-world")
  public String helloWorld(){
    
    repository.save( new Product("Papel", 20000, 20));
    // String[][] data = {
    //   		{"Papel", "20000", "20"},
    //   		{"Locion", "30000", "100"},
    //   		{"Cartas", "25000", "75"}
    //   	};
    //     Stream.of(data).forEach(array -> {
    //       		  try {
    //       			Product product = new Product(
    //       				array[0],
    //       				Integer.valueOf(array[1]),
    //       				NumberFormat.getInstance().parse(array[2])
    //       			);
    //       			repository.save(product);
    //       		  }
    //       		  catch (ParseException e) {
    //       			e.printStackTrace();
    //       		  }
    //       		});
    // return repository.findAll().toString();
    return "Hello world";
  }
}