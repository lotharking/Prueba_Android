/**ORM for model users */

package com.test.users_guide.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    int id;

    String first_name;
    
    String last_name;
    
    String username;
    
    String password;

    String token;

    @JoinColumn(name = "ID_WISH")
    @Nullable
    int wish;

    public User() {}

    public User(String first_name, String last_name, String username, String password, int wish, String token){
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.wish = wish;
        this.token = token;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFirstName() { return first_name; }

    public String setFirstName(String first_name) { return this.first_name = first_name; }

    public String getLastName() { return last_name; }

    public String setLastName(String last_name) { return this.last_name = last_name; }

    public String getUsername() { return username; }

    public String setUsername(String username) { return this.username = username; }

    public String getPassword() { return password; }

    public String setPassword(String password) { return this.password = password; }

    public String getToken() { return token; }

    public String setToken(String token) { return this.token = token; }

    public int getWish() { return wish; }

    public void setWish(int wish) { this.wish = wish; }
    
}
