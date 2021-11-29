package com.test.sprongboot.catalogo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "wish")
public class Wish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Product product;
    private int amount;    
    
    public Wish() {}

    public Wish(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }    

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }
}
