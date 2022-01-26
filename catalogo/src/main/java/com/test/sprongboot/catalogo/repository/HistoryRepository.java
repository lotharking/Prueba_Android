/**Repository for managment of consult in history */

package com.test.sprongboot.catalogo.repository;

import java.util.List;

import com.test.sprongboot.catalogo.entity.History;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer> {
    
   /**find data of wish with id especific */
   @Query(value = "SELECT * FROM histories WHERE wish_id =:id", 
   nativeQuery = true)
   List<String> findByIdwish(@Param("id") int id);
    
}
