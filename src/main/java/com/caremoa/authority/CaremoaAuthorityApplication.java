package com.caremoa.authority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CaremoaAuthorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaremoaAuthorityApplication.class, args);
	}

}
