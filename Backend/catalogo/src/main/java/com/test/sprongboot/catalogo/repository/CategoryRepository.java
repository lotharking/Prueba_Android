/**Repository for methods of categories */

package com.test.sprongboot.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.sprongboot.catalogo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
