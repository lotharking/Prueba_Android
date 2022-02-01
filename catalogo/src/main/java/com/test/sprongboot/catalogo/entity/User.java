/**ORM for model users */

package com.test.sprongboot.catalogo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_WISH")
    private Wish wish;

    public User() {}

    public User(String first_name, String last_name, String username, String password, Wish wish){
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.wish = wish;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFirstName() { return first_name; }

    public String setFirstName(String first_name) { return first_name; }

    public String getLastName() { return last_name; }

    public String setLastName(String last_name) { return last_name; }

    public String getUsername() { return username; }

    public String setUsername(String username) { return username; }

    public String getPassword() { return password; }

    public String setPassword(String password) { return password; }

    public Wish getWish() { return wish; }

    public void setWish(Wish wish) { this.wish = wish; }
    
}
