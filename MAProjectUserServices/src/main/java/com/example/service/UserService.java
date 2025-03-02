package com.example.service;

import com.example.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);

    Optional<User> getUserByUsername(String email);

    List<User> getAllUsers();
}
