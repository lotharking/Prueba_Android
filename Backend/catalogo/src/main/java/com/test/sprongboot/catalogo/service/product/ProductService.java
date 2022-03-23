package com.test.sprongboot.catalogo.service.product;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Product;

public interface ProductService {

    List<Product> findAllByParam(String value);

    List<Product> findAllByParamVoid();

    List<Product> findAll();

    Product getById(int id);
    
}
