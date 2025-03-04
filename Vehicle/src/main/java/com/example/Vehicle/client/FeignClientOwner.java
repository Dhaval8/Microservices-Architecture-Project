package com.example.Vehicle.client;

import com.example.Vehicle.dto.OwnerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "owner", url="localhost:8081")
public interface FeignClientOwner {
    @GetMapping("/{id}/dtodetails")
    OwnerDTO getOwnerById(@PathVariable int id);
}
