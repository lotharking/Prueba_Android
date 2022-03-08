/**Products controller */

package com.test.sprongboot.catalogo.controller;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Product;
import com.test.sprongboot.catalogo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/products")
public class ProductController {

  @Autowired
  private ProductRepository repository;

  /**list product */
  @GetMapping(path = "/list")
  public ResponseEntity<List<Product>> list(){
    List<Product> list = repository.findAll();
    return new ResponseEntity(list, HttpStatus.OK);
  }

  /**search product unique */
  @GetMapping(path = "/search/{value}")
  public ResponseEntity<List<Product>> search(@PathVariable("value") String value){
    List<Product> list = repository.findAllByParam(value);
    return new ResponseEntity(list, HttpStatus.OK);
  }

  /**search product */
  @GetMapping(path = "/search/")
  public ResponseEntity<List<Product>> searchvoid(){
    List<Product> list = repository.findAllByParamVoid();
    return new ResponseEntity(list, HttpStatus.OK);
  }
}