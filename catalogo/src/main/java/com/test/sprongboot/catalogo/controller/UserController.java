/**Users controller */

package com.test.sprongboot.catalogo.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.sprongboot.catalogo.entity.User;
import com.test.sprongboot.catalogo.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UsersRepository repository;

  /** search user unique */
  @PostMapping(value = "/login")
  // public ResponseEntity<User> login(@RequestBody Map<String, Object> dataUser){
  public User login(@RequestBody Map<String, Object> dataUser) {

    String username = dataUser.get("username").toString();
    String password = dataUser.get("password").toString();
    User user = (repository.findByParam(username) != null) ? repository.findByParam(username) : new User();

    
    if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {      
      // token implement if user isValid
      String token = getJWTToken(username);
      user.setUsername(username);
      user.setToken(token);
    }

    return user;
  }

  private String getJWTToken(String username) {
    String secretKey = "mySecretKey";
    List<GrantedAuthority> grantedAuthorities = AuthorityUtils
        .commaSeparatedStringToAuthorityList("ROLE_USER");

    String token = Jwts
        .builder()
        .setId("softtekJWT")
        .setSubject(username)
        .claim("authorities",
            grantedAuthorities.stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList()))
        .setIssuedAt(new Date(System.currentTimeMillis()))
        .setExpiration(new Date(System.currentTimeMillis() + 600000))
        .signWith(SignatureAlgorithm.HS512,
            secretKey.getBytes())
        .compact();

    return "Bearer " + token;
  }

}
