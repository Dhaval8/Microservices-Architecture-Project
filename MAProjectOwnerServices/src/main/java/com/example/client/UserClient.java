package com.example.client;

import com.example.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "http://MAPROJECTUSERSERVICES")
public interface UserClient {
    @GetMapping("/{id}/dtodetails")
    UserDTO getUserById(@PathVariable int id);
}
