/**Repository for methods of products */

package com.test.sprongboot.catalogo.repository;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    /**Search from product table */
    @Query(value = "SELECT * FROM product where name like CONCAT('%',:value,'%')", 
       nativeQuery = true)
    List<Product> findAllByParam(@Param("value") String value);

    /**Search from product table with parameters */
    @Query(value = "SELECT * FROM product where name like '%%'", 
       nativeQuery = true)
    List<Product> findAllByParamVoid();
}
