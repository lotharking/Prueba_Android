package com.test.sprongboot.catalogo.repository;

import com.test.sprongboot.catalogo.entity.Wish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishRepository extends JpaRepository<Wish, Integer> {
    
}
