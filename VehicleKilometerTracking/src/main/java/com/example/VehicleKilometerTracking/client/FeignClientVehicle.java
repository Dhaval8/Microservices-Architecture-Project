package com.example.VehicleKilometerTracking.client;

import com.example.VehicleKilometerTracking.dto.VehicleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "vehicle", url = "http://localhost:8085")
public interface FeignClientVehicle {
    @GetMapping("/{id}")
    VehicleDTO getVehicleById(@PathVariable int id);
}
