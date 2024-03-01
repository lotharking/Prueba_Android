package com.microservice.auth.domain;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User getUserById(UUID userId);
    List<User> getAllUsers();
    User saveUser(User user);
    User updateUser(UUID userId, User updatedUser);
    void deleteUser(UUID userId);
}
