package com.citiustech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TogglezConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(TogglezConfigServer.class, args);
	}

}
