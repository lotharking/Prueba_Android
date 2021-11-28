package com.test.sprongboot.catalogo.controller;

import java.util.List;

import com.test.sprongboot.catalogo.Msg.Message;
import com.test.sprongboot.catalogo.entity.Product;
import com.test.sprongboot.catalogo.entity.Wish;
import com.test.sprongboot.catalogo.repository.ProductRepository;
import com.test.sprongboot.catalogo.repository.WishRepository;

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
@RequestMapping("/wish")
public class WishController {

    @Autowired
    private WishRepository repository;

    @Autowired
    private ProductRepository productrepository;
    
    @GetMapping(path = "/add/{id}")
    public ResponseEntity<List<Wish>> add(@PathVariable("id") int id){
        if (repository.findByIdProduct(id) == null || repository.findByIdProduct(id).size() == 0){
            repository.save(new Wish(productrepository.getById(id), 1));
        }
        else{            
            String data = repository.findIdByProduct(id);
            int data_out = Integer.valueOf(data);
            int cont = repository.getById(data_out).getAmount() + 1;
            repository.getById(data_out).setAmount(cont);
            repository.save(repository.getById(data_out));
        }
        List<Wish> list = repository.findAll();
        
        return new ResponseEntity(list, HttpStatus.OK);
  }
    
    @GetMapping(path = "/less/{id}")
    public ResponseEntity<?> less(@PathVariable("id") int id){
        // System.out.println("control 1: " +repository.findByIdProduct(id));
        String data = repository.findIdByProduct(id);
        int data_out = Integer.valueOf(data);
        // System.out.println("control 2: " +repository.getById(data_out).getAmount());
        int cont = repository.getById(data_out).getAmount() - 1;
        // System.out.println("control 4: " +repository.getById(data_out).getAmount());
        if (cont<0 || cont==0){
            cont = 0;
            repository.deleteById(data_out);
        } else{
            repository.getById(data_out).setAmount(cont);
            // System.out.println("control 3: " + repository.getById(data_out));
            repository.save(repository.getById(data_out));
            // System.out.println("control 5: " +repository.getById(data_out));
        }
        List<Wish> list = repository.findAll();

        return new ResponseEntity(list, HttpStatus.OK);
  }
    
    @GetMapping(path = "/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if (repository.existsById(id))
            repository.deleteById(id);
        return new ResponseEntity(new Message("Item eliminado"), HttpStatus.OK);
  }
    
}
