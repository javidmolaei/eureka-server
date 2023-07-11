package com.javid.mo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoApplication.class, args);
	}

}
