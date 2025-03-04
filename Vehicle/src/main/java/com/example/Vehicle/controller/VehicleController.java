package com.example.Vehicle.controller;

import com.example.Vehicle.entity.VehicleEntity;
import com.example.Vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    VehicleService service;

    @GetMapping("/{id}")
    public ResponseEntity<VehicleEntity> getVehicle(@PathVariable int id) {
        return service.getVehicle(id);
    }

    @GetMapping("/")
    public ResponseEntity<List<VehicleEntity>> getAllVehicle() {
        return service.getAllVehicle();
    }

    @PostMapping("/")
    public ResponseEntity<VehicleEntity> createVehicle(@RequestBody VehicleEntity vehicle) {
        return service.createVehicle(vehicle);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VehicleEntity> updateVehicle(@PathVariable int id, @RequestBody VehicleEntity vehicle) {
        return service.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicle(@PathVariable int id) {
        return service.deleteVehicle(id);
    }
}
