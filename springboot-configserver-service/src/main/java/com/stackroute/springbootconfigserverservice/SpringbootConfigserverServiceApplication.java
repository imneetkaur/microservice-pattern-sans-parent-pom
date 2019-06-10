package com.stackroute.springbootconfigserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootConfigserverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigserverServiceApplication.class, args);
	}

}
