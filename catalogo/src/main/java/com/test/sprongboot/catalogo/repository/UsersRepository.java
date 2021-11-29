package com.test.sprongboot.catalogo.repository;

import com.test.sprongboot.catalogo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer>{
    
}
