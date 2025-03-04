package com.example.VehicleKilometerTracking.service;

import com.example.VehicleKilometerTracking.entity.VehicleKilometerTracking;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VehicleKilometerTrackingService {
    public ResponseEntity<VehicleKilometerTracking> getVehicleKilometerTracking(int id);
    public ResponseEntity<List<VehicleKilometerTracking>> getAllVehicleKilometerTracking();
    public ResponseEntity<VehicleKilometerTracking> createVehicleKilometerTracking(VehicleKilometerTracking vehicleKilometerTracking);
    public ResponseEntity<VehicleKilometerTracking> updateVehicleKilometerTracking(int id, VehicleKilometerTracking vehicleKilometerTracking);
    public ResponseEntity<String> deleteVehicleKilometerTracking(int id);
}
