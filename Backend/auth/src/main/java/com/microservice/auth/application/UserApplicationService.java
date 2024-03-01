package com.microservice.auth.application;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.auth.domain.User;
import com.microservice.auth.domain.UserService;

@Service
public class UserApplicationService {

    @Autowired
    private UserService userService;

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public User getUserById(UUID userId) {
        return userService.getUserById(userId);
    }

    public User createUser(User user) {
        return userService.saveUser(user);
    }

    public User updateUser(UUID userId, User user) {
        return userService.updateUser(userId, user);
    }

    public void deleteUser(UUID userId) {
        userService.deleteUser(userId);
    }
}
