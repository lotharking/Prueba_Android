package com.microservice.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.auth.entity.User;
import com.microservice.auth.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository repository;

    @Override
    public User findByParam(String value) {
        return repository.findByParam(value);
    }
    
}
