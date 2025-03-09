package com.example.VehicleKilometerTracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VehicleKilometerTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleKilometerTrackingApplication.class, args);
	}

}
