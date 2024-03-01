package com.microservice.auth.infrastructure;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.microservice.auth.domain.User;
import com.microservice.auth.domain.UserRepository;

@Repository
public class UserRepositoryAdapter implements UserRepository {

    @Override
    public User findById(UUID userId) {
        // Implement logic to fetch user from the database
        return null;
    }

    @Override
    public User save(User user) {
        // Implement logic to save user to the database
        return null;
    }

    @Override
    public void delete(UUID userId) {
        // Implement logic to delete user from the database
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void update(UUID userId, User updatedUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
