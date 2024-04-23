package com.microservice.auth.service;

import com.microservice.auth.entity.User;

public interface UsersService {

    User findByParam(String value);
    
}
