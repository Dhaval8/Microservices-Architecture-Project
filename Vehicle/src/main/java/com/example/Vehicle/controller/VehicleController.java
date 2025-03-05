package com.example.Vehicle.controller;

import com.example.Vehicle.client.FeignClientOwner;
import com.example.Vehicle.dto.OwnerDTO;
import com.example.Vehicle.entity.VehicleEntity;
import com.example.Vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicles")
public class VehicleController {
    @Autowired
    VehicleService service;
    @Autowired
    FeignClientOwner feignClientOwner;

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

    @GetMapping("/{id}/owner")
    public ResponseEntity<OwnerDTO> getOwner(@PathVariable int id) {
        VehicleEntity vehicle = service.getVehicle(id).getBody();
        if(vehicle==null) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        } else {
            int ownerID = vehicle.getVehicleOwnerID();
            OwnerDTO owner = feignClientOwner.getOwnerById(ownerID);
            return new ResponseEntity<>(owner, HttpStatus.OK);
        }
    }
}
