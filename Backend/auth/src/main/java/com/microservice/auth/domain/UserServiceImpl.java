package com.microservice.auth.domain;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(UUID userId) {
        return userRepository.findById(userId);
    }
    
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(UUID userId, User updatedUser) {
        userRepository.update(userId, updatedUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(UUID userId) {
        userRepository.delete(userId);
    }

    // Implementación de los métodos de UserService
}
