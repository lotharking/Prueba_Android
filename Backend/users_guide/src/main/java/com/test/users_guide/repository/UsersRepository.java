/**Repository for managment of consult in Users */

package com.test.users_guide.repository;

import com.test.users_guide.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<User, Integer>{

    /**Search from product table */
    @Query(value = "SELECT * FROM users where username like CONCAT('%',:value,'%')", 
       nativeQuery = true)
    User findByParam(@Param("value") String value);
    
}
