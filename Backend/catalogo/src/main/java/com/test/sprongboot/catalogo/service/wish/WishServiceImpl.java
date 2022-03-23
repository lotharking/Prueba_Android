package com.test.sprongboot.catalogo.service.wish;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Wish;
import com.test.sprongboot.catalogo.repository.WishRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements WishService{

    @Autowired
    private WishRepository repository;

    @Override
    public List<String> findByIdProduct(int id) {
        return repository.findByIdProduct(id);
    }

    @Override
    public String findIdByProduct(int id) {
        return repository.findIdByProduct(id);
    }

    @Override
    public void save(Wish wish) {
        repository.save(wish);
    }

    @Override
    public Wish getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Wish> findAll() {
        return repository.findAll();
    }
    
}
