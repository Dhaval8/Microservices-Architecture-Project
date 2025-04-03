package com.example.VehicleKilometerTracking.controller;

import com.example.VehicleKilometerTracking.client.FeignClientVehicle;
import com.example.VehicleKilometerTracking.dto.VehicleDTO;
import com.example.VehicleKilometerTracking.entity.VehicleKilometerTracking;
import com.example.VehicleKilometerTracking.service.VehicleKilometerTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleKilometerTrackingController {
    @Autowired
    VehicleKilometerTrackingService service;

    @Autowired
    FeignClientVehicle feignClientVehicle;

    @GetMapping("/")
    public ResponseEntity<List<VehicleKilometerTracking>> getAllVehicleKilometerTracking() {
        return service.getAllVehicleKilometerTracking();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehicleKilometerTracking> getVehicleKilometerTracking(@PathVariable int id) {
        return service.getVehicleKilometerTracking(id);
    }

    @PostMapping("/")
    public ResponseEntity<VehicleKilometerTracking> createVehicleKilometerTracking(@RequestBody VehicleKilometerTracking vehicleKilometerTracking) {
        return service.createVehicleKilometerTracking(vehicleKilometerTracking);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VehicleKilometerTracking> updateVehicleKilometerTracking(@PathVariable int id, @RequestBody VehicleKilometerTracking vehicleKilometerTracking) {
        return service.updateVehicleKilometerTracking(id, vehicleKilometerTracking);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicleKilometerTracking(@PathVariable int id) {
        return service.deleteVehicleKilometerTracking(id);
    }

    @GetMapping("/{id}/vehicle")
    public ResponseEntity<VehicleDTO> getVehicle(@PathVariable int id) {
        VehicleKilometerTracking vehicleKilometerTracking = service.getVehicleKilometerTracking(id).getBody();
        if(vehicleKilometerTracking ==null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            int vehicleID = vehicleKilometerTracking.getVehicleKilometerVehicleID();
            VehicleDTO vehicle = feignClientVehicle.getVehicleById(vehicleID);
            return new ResponseEntity<>(vehicle, HttpStatus.OK);
        }
    }
}
