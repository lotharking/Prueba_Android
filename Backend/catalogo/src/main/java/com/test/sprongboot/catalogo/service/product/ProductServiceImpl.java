package com.test.sprongboot.catalogo.service.product;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Product;
import com.test.sprongboot.catalogo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAllByName(String value) {
        return repository.findAllByName(value);
    }

    @Override
    public List<Product> findAllByParamVoid() {
        return repository.findAllByParamVoid();
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product getById(int id) {
        return repository.getById(id);
    }

	@Override
	public List<Product> findAllByCategory(Integer value) {
		return repository.findAllByCategory(value);
	}
    
}
