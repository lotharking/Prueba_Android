/**Controller operation wishes */

package com.test.sprongboot.catalogo.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.sprongboot.catalogo.entity.History;
import com.test.sprongboot.catalogo.entity.Wish;
import com.test.sprongboot.catalogo.service.history.HistoryService;
import com.test.sprongboot.catalogo.service.product.ProductService;
import com.test.sprongboot.catalogo.service.wish.WishService;

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
    private WishService wishService;

    @Autowired
    private ProductService productService;

    @Autowired
    private HistoryService historyService;

    /**add wish */
    @GetMapping(path = "/add/{id}")
    public ResponseEntity<List<Wish>> add(@PathVariable("id") int id){
        if (wishService.findByIdProduct(id) == null || wishService.findByIdProduct(id).size() == 0){
            wishService.save(new Wish(productService.getById(id), 1, 1));
            
            String data = wishService.findIdByProduct(id);
            int data_out = Integer.valueOf(data);
            if (historyService.findByIdwish(data_out) != null)
            	historyService.save(new History(wishService.getById(data_out)));
        }
        else{            
            String data = wishService.findIdByProduct(id);
            int data_out = Integer.valueOf(data);
            int cont = wishService.getById(data_out).getAmount() + 1;
            wishService.getById(data_out).setAmount(cont);
            wishService.save(wishService.getById(data_out));
        }
        List<Wish> list = wishService.findAll();
        Collections.sort(list, Comparator.comparingInt(Wish::getId));
        
        return new ResponseEntity<List<Wish>>(list, HttpStatus.OK);
  }
    
    /**dismiss wish */
    @GetMapping(path = "/less/{id}")
    public ResponseEntity<List<Wish>> less(@PathVariable("id") int id){
        String data = wishService.findIdByProduct(id);
        int data_out = Integer.valueOf(data);
        int cont = wishService.getById(data_out).getAmount() - 1;
        if (cont<0 || cont==0){
            cont = 0;
        } 
        wishService.getById(data_out).setAmount(cont);
        wishService.save(wishService.getById(data_out));
        List<Wish> list = wishService.findAll();
        Collections.sort(list, Comparator.comparingInt(Wish::getId));

        return new ResponseEntity<List<Wish>>(list, HttpStatus.OK);
  }
    
    /**Delete wish in data */
    @GetMapping(path = "/delete/{id}")
    public ResponseEntity<List<Wish>> delete(@PathVariable("id") int id){
        String data = wishService.findIdByProduct(id);
        int data_out = Integer.valueOf(data);
        wishService.getById(data_out).setAmount(0);
        wishService.save(wishService.getById(data_out));
        List<Wish> list = wishService.findAll();
        Collections.sort(list, Comparator.comparingInt(Wish::getId));
        return new ResponseEntity<List<Wish>>(list, HttpStatus.OK);
  }

  /**List the wishes */
  @GetMapping(path = "/list")
  public ResponseEntity<List<Wish>> list(){
    List<Wish> list = wishService.findAll();
    Collections.sort(list, Comparator.comparingInt(Wish::getId));
    return new ResponseEntity<List<Wish>>(list, HttpStatus.OK);
  }
    
}
