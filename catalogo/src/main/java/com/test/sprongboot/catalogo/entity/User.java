package com.test.sprongboot.catalogo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    String pwd;

    public User() {}

    public User(String first_name, String last_name, String username, String pwd){
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.pwd = pwd;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFirstName() { return first_name; }

    public String setFirstName(String first_name) { return first_name; }

    public String getLastName() { return last_name; }

    public String setLastName(String last_name) { return last_name; }

    public String getUsername() { return username; }

    public String setUsername(String username) { return username; }

    public String getPWD() { return pwd; }

    public String setPWD(String pwd) { return pwd; }
    
}
