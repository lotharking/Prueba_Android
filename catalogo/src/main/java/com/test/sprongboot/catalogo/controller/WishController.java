/**Controller operation wishes */

package com.test.sprongboot.catalogo.controller;

import java.util.List;

import com.test.sprongboot.catalogo.entity.History;
import com.test.sprongboot.catalogo.entity.Wish;
import com.test.sprongboot.catalogo.repository.HistoryRepository;
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

    @Autowired
    private HistoryRepository historyrepository;

    /**add wish */
    @GetMapping(path = "/add/{id}")
    public ResponseEntity<List<Wish>> add(@PathVariable("id") int id){
        if (repository.findByIdProduct(id) == null || repository.findByIdProduct(id).size() == 0){
            repository.save(new Wish(productrepository.getById(id), 1, null));
            
            String data = repository.findIdByProduct(id);
            int data_out = Integer.valueOf(data);
            if (historyrepository.findByIdwish(data_out) != null)
                historyrepository.save(new History(repository.getById(data_out)));
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
    
    /**dismiss wish */
    @GetMapping(path = "/less/{id}")
    public ResponseEntity<?> less(@PathVariable("id") int id){
        String data = repository.findIdByProduct(id);
        int data_out = Integer.valueOf(data);
        int cont = repository.getById(data_out).getAmount() - 1;
        if (cont<0 || cont==0){
            cont = 0;
        } 
            repository.getById(data_out).setAmount(cont);
            repository.save(repository.getById(data_out));
        List<Wish> list = repository.findAll();

        return new ResponseEntity(list, HttpStatus.OK);
  }
    
    /**Delete wish in data */
    @GetMapping(path = "/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        String data = repository.findIdByProduct(id);
        int data_out = Integer.valueOf(data);
        repository.getById(data_out).setAmount(0);
        repository.save(repository.getById(data_out));
        List<Wish> list = repository.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
  }

  /**List the wishes */
  @GetMapping(path = "/list")
  public ResponseEntity<List<Wish>> list(){
    List<Wish> list = repository.findAll();
    return new ResponseEntity(list, HttpStatus.OK);
  }
    
}
