package com.cogent.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Application started .....");
	}

	public static void main(String[] args) {
		log.info("Application executed.");
		log.info("new change");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
