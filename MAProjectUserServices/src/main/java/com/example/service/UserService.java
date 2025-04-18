package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    // Create User
    public User createUser(User user) {

        return userRepo.save(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Get User by ID
    public Optional<User> getUserById(int id) {
        return userRepo.findById(id);
    }

    // Update User
    public User updateUser(int id, User updatedUser) {
        return userRepo.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setContact(updatedUser.getContact());
            user.setAddress(updatedUser.getAddress());
            return userRepo.save(user);
        }).orElse(null);
    }

    // Delete User
    public boolean deleteUser(int id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
            return true;
        }
        return false;
    }
}

