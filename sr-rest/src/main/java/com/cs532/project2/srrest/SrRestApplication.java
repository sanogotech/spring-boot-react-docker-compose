package com.cs532.project2.srrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SrRestApplication {

	public static void main(String[] args) {
		System.out.println("-- Start RestApplication ---");
		SpringApplication.run(SrRestApplication.class, args);
	}
}
