/**Users controller */

package com.test.sprongboot.catalogo.controller;

import java.util.List;

import com.test.sprongboot.catalogo.entity.User;
import com.test.sprongboot.catalogo.repository.UsersRepository;

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
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersRepository repository;

    /**search user unique */
    @GetMapping(path = "/login/username={username}&password={password}")
    public ResponseEntity<User> search(@PathVariable("username") String username, @PathVariable("password") String password){
      User user = repository.findByParam(username);
      boolean answer =false;
      if (username.equals(user.getUsername()) && password.equals(user.getPassword()))
        answer= true;

      return new ResponseEntity(answer, HttpStatus.OK);
    }
    
}
