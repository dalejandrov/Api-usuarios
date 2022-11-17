package com.example.holamundoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication
@EnableJpaAuditing
public class HolamundoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolamundoapiApplication.class, args);
	}

}
