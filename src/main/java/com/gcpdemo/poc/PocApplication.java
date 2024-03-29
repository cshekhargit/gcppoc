package com.gcpdemo.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class PocApplication {

	private final Logger logger = LoggerFactory.getLogger(PocApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}

}
