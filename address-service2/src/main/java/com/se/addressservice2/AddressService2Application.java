package com.se.addressservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AddressService2Application {

	public static void main(String[] args) {
		SpringApplication.run(AddressService2Application.class, args);
	}

}
