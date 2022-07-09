package com.example.jenkinsdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class JenkinsDemoApplication {

	@PostConstruct
	public void init(){
		log.info("Application init");
	}
	public static void main(String[] args) {
		log.info("Application Executed");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
