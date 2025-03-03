package com.example.service;

import com.example.entity.Owner;
import com.example.repository.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepo ownerRepo;

    // Create Owner
    public Owner createOwner(Owner owner) {
        return ownerRepo.save(owner);
    }

    // Get All Owners
    public List<Owner> getAllOwners() {
        return ownerRepo.findAll();
    }

    // Get Owner by ID
    public Optional<Owner> getOwnerById(int id) {
        return ownerRepo.findById(id);
    }

    // Update Owner
    public Owner updateOwner(int id, Owner updatedOwner) {
        return ownerRepo.findById(id).map(owner -> {
            owner.setName(updatedOwner.getName());
            owner.setEmail(updatedOwner.getEmail());
            owner.setContact(updatedOwner.getContact());
            owner.setAddress(updatedOwner.getAddress());
            return ownerRepo.save(owner);
        }).orElse(null);
    }

    // Delete Owner
    public boolean deleteOwner(int id) {
        if (ownerRepo.existsById(id)) {
            ownerRepo.deleteById(id);
            return true;
        }
        return false;
    }
}