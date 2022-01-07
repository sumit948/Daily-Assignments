package com.example.LoadBalanceServer.weekfiveloadbalanceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WeekfiveloadbalanceserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekfiveloadbalanceserverApplication.class, args);
	}

}
