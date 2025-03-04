package com.example.Vehicle.service;

import com.example.Vehicle.entity.VehicleEntity;
import com.example.Vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepository repo;

    @Override
    public ResponseEntity<VehicleEntity> createVehicle(VehicleEntity vehicle) {
        return new ResponseEntity<>(repo.save(vehicle), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<VehicleEntity> getVehicle(int id) {
        Optional<VehicleEntity> veh = repo.findById(id);
        if(veh.isPresent()) {
            VehicleEntity vehicle = veh.get();
            return new ResponseEntity<>(vehicle, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<VehicleEntity>> getAllVehicle() {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<VehicleEntity> updateVehicle(int id, VehicleEntity vehicle) {
        Optional<VehicleEntity> veh = repo.findById(id);
        if (veh.isPresent()) {
            VehicleEntity vehicle1 = veh.get();
            vehicle1.setVehicleLocation(vehicle.getVehicleLocation());
            vehicle1.setVehicleStatus(vehicle.getVehicleStatus());
            vehicle1.setVehicleOwnerID(vehicle.getVehicleOwnerID());
            return new ResponseEntity<>(repo.save(vehicle1), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<String> deleteVehicle(int id) {
        repo.deleteById(id);
        return new ResponseEntity<>("Employee Deleted",HttpStatus.NO_CONTENT);
    }
}