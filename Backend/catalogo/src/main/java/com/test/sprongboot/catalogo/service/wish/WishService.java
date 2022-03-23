package com.test.sprongboot.catalogo.service.wish;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Wish;

public interface WishService {

    List<String> findByIdProduct(int id);
    
    String findIdByProduct(int id);

    void save(Wish wish);

    Wish getById(int id);

    List<Wish> findAll();
    
}
