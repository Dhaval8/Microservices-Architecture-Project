package com.example.VehicleKilometerTracking.service;

import com.example.VehicleKilometerTracking.entity.VehicleKilometerTracking;
import com.example.VehicleKilometerTracking.repository.VehicleKilometerTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleKilometerTrackingServiceImpl implements VehicleKilometerTrackingService {
    @Autowired
    VehicleKilometerTrackingRepository repository;
    @Override
    public ResponseEntity<VehicleKilometerTracking> getVehicleKilometerTracking(int id) {
        Optional<VehicleKilometerTracking> track = repository.findById(id);
        if(track.isPresent()) {
            VehicleKilometerTracking vehicleKilometerTracking = track.get();
            return new ResponseEntity<>(vehicleKilometerTracking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<VehicleKilometerTracking>> getAllVehicleKilometerTracking() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<VehicleKilometerTracking> createVehicleKilometerTracking(VehicleKilometerTracking vehicleKilometerTracking) {
        return new ResponseEntity<>(vehicleKilometerTracking, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<VehicleKilometerTracking> updateVehicleKilometerTracking(int id, VehicleKilometerTracking vehicleKilometerTracking) {
        Optional<VehicleKilometerTracking> track = repository.findById(id);
        if(track.isPresent()) {
            VehicleKilometerTracking vehicleKilometerTracking1 = track.get();
            vehicleKilometerTracking1.setVehicleKilometerLastUpdated(vehicleKilometerTracking.getVehicleKilometerLastUpdated());
            vehicleKilometerTracking1.setVehicleKilometerTotalKilometers(vehicleKilometerTracking.getVehicleKilometerTotalKilometers());
            vehicleKilometerTracking1.setVehicleKilometerVehicleID(vehicleKilometerTracking.getVehicleKilometerVehicleID());
            return new ResponseEntity<>(repository.save(vehicleKilometerTracking1), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<String> deleteVehicleKilometerTracking(int id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Deleted entity", HttpStatus.NO_CONTENT);
    }
}
