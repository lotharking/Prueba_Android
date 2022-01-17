/**Entity wishes */

package com.test.sprongboot.catalogo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "wish")
public class Wish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @OneToMany(mappedBy="product",cascade=CascadeType.ALL)
    private List<Product> products;

    private int amount;    
    
    public Wish() {}

    public Wish(List<Product> products, int amount) {
        this.products = products;
        this.amount = amount;
    }    

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public List<Product> getProduct() { return products; }

    public void setProduct(List<Product> products) { this.products = products; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }
}
