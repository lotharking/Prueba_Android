package com.test.sprongboot.catalogo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private int price;
    private int stock;

    public Product(){}

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getProductPrice() { return price; }

    public void setProductPrice(int price) { this.price = price; }

    public int getProductId() { return stock; }

    public void setProductId(int stock) { this.stock = stock; }
    
}
