package com.test.sprongboot.catalogo.repository;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Wish;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WishRepository extends JpaRepository<Wish, Integer> {

   /**find data of product with id especific */
   @Query(value = "SELECT * FROM wish WHERE product_id =:id", 
   nativeQuery = true)
   List<String> findByIdProduct(@Param("id") int id);
   
   /**find id of wish with id especific */
    @Query(value = "SELECT id FROM wish WHERE product_id =:id", 
       nativeQuery = true)
    String findIdByProduct(@Param("id") int id);

   //  @Query(value = "SELECT id FROM wish WHERE product_id =:id", 
   //     nativeQuery = true)
   //  String findAllByCheck(@Param("id") int id);
}
