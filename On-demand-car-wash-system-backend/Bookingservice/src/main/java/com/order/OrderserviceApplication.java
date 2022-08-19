package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.event.EventListener;



@SpringBootApplication
@EnableEurekaClient
public class OrderserviceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceApplication.class, args);
	}

	
}
