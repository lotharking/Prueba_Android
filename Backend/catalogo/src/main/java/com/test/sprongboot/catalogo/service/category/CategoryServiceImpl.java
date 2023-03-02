/**Category service implementation */

package com.test.sprongboot.catalogo.service.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sprongboot.catalogo.entity.Category;
import com.test.sprongboot.catalogo.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository repository;

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

}
