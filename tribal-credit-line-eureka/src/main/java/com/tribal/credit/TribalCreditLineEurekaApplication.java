package com.tribal.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * When a microservice starts up, it will communicate with the Eureka server
 * to notify you that it is available to be consumed. 
 * The Eureka server will keep the information of all registered microservices
 * and their status.
 * @author cm_ol
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class TribalCreditLineEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TribalCreditLineEurekaApplication.class, args);
	}

}
