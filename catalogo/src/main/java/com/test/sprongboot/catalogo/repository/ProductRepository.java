package com.test.sprongboot.catalogo.repository;

import com.test.sprongboot.catalogo.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // List<Product> findByName(String name);
    // List<Product> findByPrice(int price);
    // List<Product> findByStock(int Stock);
    // List<Product> findAll();
}
