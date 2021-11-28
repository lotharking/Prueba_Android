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
        int cont = 0;
        if (repository.findByIdProduct(id) == null || repository.findByIdProduct(id).size() == 0){
            // System.out.println("consultas 1: "+ repository.findByIdProduct(id)+ " id: "+ id);
            // System.out.println("consultas 3: "+ productrepository.findById(id));
            repository.save(new Wish(productrepository.getById(id), 1));
            // System.out.println("consultas 2: "+ repository.findByIdProduct(id));
        }
        else{            
            // System.out.println("consultas 4: "+ repository.findIdByProduct(id));
            String data = repository.findIdByProduct(id);
            if (data != null){
                int data_out = Integer.valueOf(data);
                // System.out.println("consultas 5: "+ repository.getById(data_out).getAmount());
                cont = repository.getById(data_out).getAmount() + 1;
                // System.out.println("consultas 6: "+ cont);
                repository.getById(data_out).setAmount(cont);
                repository.save(repository.getById(data_out));
            }
        }
        List<Wish> list = repository.findAll();
        
        return new ResponseEntity(list, HttpStatus.OK);
  }
    
    @GetMapping(path = "/less/{id}")
    public ResponseEntity<?> less(@PathVariable("id") int id){
        int cont = 0;
        if (repository.existsById(id)){
            cont = repository.getById(id).getAmount() - 1;
            if (cont<0){
                cont = 0;
                repository.deleteById(id);
            } else{
                repository.getById(id).setAmount(cont);
            }
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
