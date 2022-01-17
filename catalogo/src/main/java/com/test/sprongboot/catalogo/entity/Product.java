/**ORM for model Product */

package com.test.sprongboot.catalogo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wish_id")
    private Product product;

    public Product(){}

    public Product(String name, int price, int stock, Product product) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.product = product;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getprice() { return price; }

    public void setprice(int price) { this.price = price; }

    public int getstock() { return stock; }

    public void setstock(int stock) { this.stock = stock; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }
    
}
