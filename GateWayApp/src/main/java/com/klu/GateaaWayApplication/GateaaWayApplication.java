package com.klu.GateaaWayApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GateaaWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateaaWayApplication.class, args);
	}

}
