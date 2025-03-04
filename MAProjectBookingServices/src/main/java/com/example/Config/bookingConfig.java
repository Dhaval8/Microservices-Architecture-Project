package com.example.Config;

import com.example.Entity.bookingEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "payment-service")
public interface bookingConfig {
    @GetMapping("/{id}")
    bookingEntity getTransactionById(@PathVariable int vehicle_id);
}