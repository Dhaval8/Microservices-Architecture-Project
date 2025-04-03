package com.example.Config;

import com.example.DTO.PaymentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="payment-service", url="http://localhost:8085")

public interface PaymentConfig {
    @GetMapping("/{id}/dtodetails")
    PaymentDTO getTransactionById(@PathVariable int id);
}
