/**ORM for model History */

package com.test.sprongboot.catalogo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "histories")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Wish wish;

    public History() {}
    
    public History(Wish wish) {
        this.wish = wish;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
    
    public Wish getWish() { return wish; }
    
    public void setWish(Wish wish) { this.wish = wish; }

}
