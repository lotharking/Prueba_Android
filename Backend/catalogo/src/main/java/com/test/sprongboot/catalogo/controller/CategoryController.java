/**Products controller */

package com.test.sprongboot.catalogo.controller;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sprongboot.catalogo.service.category.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categories")
public class CategoryController {

	  @Autowired
	  private CategoryService categoryService;

	  /**list category */
	  @GetMapping(path = "/list")
	  public ResponseEntity<List<Category>> list(){
	    List<Category> list = categoryService.findAll();
	    return new ResponseEntity<List<Category>>(list, HttpStatus.OK);
	  }

}
