package com.stackroute.springbootappicationeurekaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootAppicationEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppicationEurekaRegistryApplication.class, args);
	}

}
