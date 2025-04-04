package com.example.controller;

import com.example.dto.UserDTO;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Create User
    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    // Get All Users
    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // Get User by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        Optional<User> owner = userService.getUserById(id);
        return owner.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    // Update User
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return updatedUser != null ? ResponseEntity.ok(updatedUser) : ResponseEntity.notFound().build();
    }

    // Delete Owner
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        return userService.deleteUser(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}/dtodetails")
    public UserDTO getUserDTOById(@PathVariable int id) {
        // Dummy data, replace with database lookup if needed
        return new UserDTO(id, "John Doe", "john.doe@example.com", "7534265789", "Japan");
    }
}
