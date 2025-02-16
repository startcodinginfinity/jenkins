package com.saikumar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	
	@PostConstruct
	public  init() {
		
		logger.info("Application started .......");
		
		logger.info("Application started second time ......");
		
	}

	public static void main(String[] args) {
		
		logger.info("Application Executed .......");
		
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
