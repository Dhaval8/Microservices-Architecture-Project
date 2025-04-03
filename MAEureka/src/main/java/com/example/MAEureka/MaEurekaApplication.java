package com.example.MAEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaEurekaApplication.class, args);
	}

}
