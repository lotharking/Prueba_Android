/**Category service implementation */

package com.test.sprongboot.catalogo.service.category;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.sprongboot.catalogo.repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository repository;

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

}
