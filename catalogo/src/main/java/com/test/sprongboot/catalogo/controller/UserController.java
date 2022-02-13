/**Users controller */

package com.test.sprongboot.catalogo.controller;

import java.util.List;
import java.util.Map;

import com.test.sprongboot.catalogo.entity.User;
import com.test.sprongboot.catalogo.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersRepository repository;

    /**search user unique */
    @PostMapping(value = "/login")
    public ResponseEntity<User> login(@RequestBody Map<String, Object> dataUser){
      User user = (repository.findByParam(dataUser.get("username").toString()) != null)? repository.findByParam(dataUser.get("username").toString()): new User();
      boolean answer =false;
      if (dataUser.get("username").toString().equals(user.getUsername()) && dataUser.get("password").toString().equals(user.getPassword()))
        answer= true;

      return new ResponseEntity(answer, HttpStatus.OK);
    }
    
}
