package com.test.sprongboot.catalogo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "wish")
public class Wish {
    @Id
    // @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    // @JoinColumn(name = "product_id", nullable = false, updatable = false)
    private Product product;
    
    // @ManyToOne(optional = false, fetch = FetchType.LAZY)
    // @JoinColumn(name = "users_id", nullable = false, updatable = false)
    // private User users;

    // @Column(name = "amount", nullable = false)
    private int amount;    

    // @Column(name = "check", nullable = false)
    // private int check;
    
    public Wish() {}

    public Wish(Product product, int amount) {
    // public Wish(int amount, int check, Product product, User users) {
        this.product = product;
        this.amount = amount;
        // this.check = check;
        // this.users = users;
    }    

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }

    // public User getUsers() { return users; }

    // public void setUsers(User users) { this.users = users; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }

    // public int getCheck() { return check; }

    // public void setCheck(int check) { this.check = check; }
}
