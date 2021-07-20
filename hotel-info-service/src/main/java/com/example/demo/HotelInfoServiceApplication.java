package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Hotel;

@SpringBootApplication
public class HotelInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelInfoServiceApplication.class, args);
	}
	@Bean
	public Hotel sagar() {
		return new Hotel(101,"Krishna Sagar","marathalli");
	}
	@Bean
	public Hotel sangeethar() {
		return new Hotel(102,"Hotel Sangeethar","Chennai");
	}
	@Bean
	public Hotel nandhini() {
		return new Hotel(103,"Hotel Nandhini","Hyderabad");
	}
	
	
}
