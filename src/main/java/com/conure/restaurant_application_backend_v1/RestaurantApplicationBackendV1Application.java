package com.conure.restaurant_application_backend_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class RestaurantApplicationBackendV1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplicationBackendV1Application.class, args);
	}

}
