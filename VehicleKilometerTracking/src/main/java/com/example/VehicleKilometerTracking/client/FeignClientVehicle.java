package com.example.VehicleKilometerTracking.client;

import com.example.VehicleKilometerTracking.dto.VehicleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "vehicle", url = "8080")
public interface FeignClientVehicle {
    @GetMapping("/{id}/dtodetails")
    VehicleDTO getVehicleById(@PathVariable int id);
}
