package com.example.Vehicle.service;

import com.example.Vehicle.entity.VehicleEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VehicleService {
    ResponseEntity<VehicleEntity> createVehicle(VehicleEntity vehicle);
    ResponseEntity<VehicleEntity> getVehicle(int id);
    ResponseEntity<List<VehicleEntity>> getAllVehicle();
    ResponseEntity<VehicleEntity> updateVehicle(int id, VehicleEntity vehicle);
    ResponseEntity<String> deleteVehicle(int id);
}