package com.example.Vehicle.config;

import com.example.Vehicle.entity.VehicleEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "vehicle-service", url = "http://VEHICLE")
public interface VehicleConfig {
    @GetMapping("/{vehicle_id}")
    VehicleEntity getVehicle(@PathVariable("vehicle_id") int vehicleId);
}

