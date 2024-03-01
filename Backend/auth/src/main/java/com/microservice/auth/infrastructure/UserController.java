package com.microservice.auth.infrastructure;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.auth.application.UserApplicationService;
import com.microservice.auth.domain.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserApplicationService userApplicationService;

    @GetMapping
    public List<User> getAllUsers() {
        return userApplicationService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable UUID userId) {
        return userApplicationService.getUserById(userId);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userApplicationService.createUser(user);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable UUID userId, @RequestBody User user) {
        return userApplicationService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable UUID userId) {
        userApplicationService.deleteUser(userId);
    }
}
