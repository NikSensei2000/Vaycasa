package com.niksensei.projects.vaycasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VayCasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VayCasaApplication.class, args);
	}

}
