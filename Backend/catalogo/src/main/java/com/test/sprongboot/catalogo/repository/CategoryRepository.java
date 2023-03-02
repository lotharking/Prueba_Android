/**Repository for methods of categories */

package com.test.sprongboot.catalogo.repository;

import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
