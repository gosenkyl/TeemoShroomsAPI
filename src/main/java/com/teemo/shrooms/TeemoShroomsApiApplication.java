package com.teemo.shrooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.teemo.shrooms.repository"})
@ComponentScan({"com.teeemo.shrooms"})
public class TeemoShroomsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(TeemoShroomsApiApplication.class, args);
	}
}
