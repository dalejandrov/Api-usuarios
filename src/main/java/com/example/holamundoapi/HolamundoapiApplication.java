package com.example.holamundoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication
@EnableJpaAuditing
public class HolamundoapiApplication {
	@Profile({"dev","prod"})
	public static void main(String[] args) {
		SpringApplication.run(HolamundoapiApplication.class, args);
	}
}
