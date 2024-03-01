package com.microservice.auth.domain;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findById(UUID userId);
    List<User> findAll();
    User save(User user);
    void update(UUID userId, User updatedUser);
    void delete(UUID userId);
}
