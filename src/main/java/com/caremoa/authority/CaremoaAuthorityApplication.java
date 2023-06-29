package com.caremoa.authority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@EnableFeignClients
public class CaremoaAuthorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaremoaAuthorityApplication.class, args);
	}

}
