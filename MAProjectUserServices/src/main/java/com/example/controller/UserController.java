package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class UserController {

    @Autowired
    private UserService userService;

    // Create Owner
    @PostMapping
    public ResponseEntity<User> createOwner(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    // Get All Owners
    @GetMapping
    public ResponseEntity<List<User>> getAllOwners() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // Get Owner by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> owner = userService.getUserById(id);
        return owner.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update Owner
    @PutMapping("/{id}")
    public ResponseEntity<User> updateOwner(@PathVariable Long id, @RequestBody User user) {
        User updatedOwner = userService.updateUser(id, user);
        return updatedOwner != null ? ResponseEntity.ok(updatedOwner) : ResponseEntity.notFound().build();
    }

    // Delete Owner
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
