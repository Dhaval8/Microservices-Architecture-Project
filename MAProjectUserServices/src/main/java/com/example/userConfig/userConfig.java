package com.example.userConfig;

import com.example.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customer-service", url = "http://MAPROJECTUSERSERVICES")
public interface userConfig {

    @GetMapping("/{id}")
    User getUser(@PathVariable("id") int id);
}
