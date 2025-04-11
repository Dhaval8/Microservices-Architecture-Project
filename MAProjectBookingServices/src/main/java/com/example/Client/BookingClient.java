package com.example.Client;

import com.example.DTO.BookingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "booking-service", url="http://MAPROJECTBOOKINGSERVICES")
public interface BookingClient {
    @GetMapping("/{id}/dtodetails")
    BookingDTO getBookingById(@PathVariable int id);
}
