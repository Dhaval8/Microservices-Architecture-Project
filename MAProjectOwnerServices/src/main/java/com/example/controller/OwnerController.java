package com.example.controller;

import com.example.client.UserClient;
import com.example.dto.UserDTO;
import com.example.entity.Owner;
import com.example.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    // Create Owner
    @PostMapping("/")
    public ResponseEntity<Owner> createOwner(@RequestBody Owner owner) {
        return ResponseEntity.ok(ownerService.createOwner(owner));
    }

    // Get All Owners
    @GetMapping("/")
    public ResponseEntity<List<Owner>> getAllOwners() {
        return ResponseEntity.ok(ownerService.getAllOwners());
    }

    // Get Owner by ID
    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable int id) {
        Optional<Owner> owner = ownerService.getOwnerById(id);
        return owner.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update Owner
    @PutMapping("/{id}")
    public ResponseEntity<Owner> updateOwner(@PathVariable int id, @RequestBody Owner owner) {
        Owner updatedOwner = ownerService.updateOwner(id, owner);
        return updatedOwner != null ? ResponseEntity.ok(updatedOwner) : ResponseEntity.notFound().build();
    }

    // Delete Owner
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable int id) {
        return ownerService.deleteOwner(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    private final UserClient userClient;

    public OwnerController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/{ownerId}/user/{userId}")
    public UserDTO getUserForOwner(@PathVariable int ownerId, @PathVariable int userId) {
        return userClient.getUserById(userId);
    }

}
