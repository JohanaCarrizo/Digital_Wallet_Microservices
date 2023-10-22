package com.microservices.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicesClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesClientApplication.class, args);
	}

}
