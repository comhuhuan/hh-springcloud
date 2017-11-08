package com.example.hhtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HhTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HhTestApplication.class, args);
	}
}
