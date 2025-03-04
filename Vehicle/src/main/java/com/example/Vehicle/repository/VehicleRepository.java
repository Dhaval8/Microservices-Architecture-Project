package com.example.Vehicle.repository;

import com.example.Vehicle.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Integer> {}