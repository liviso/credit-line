package com.tribal.credit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Cloud Gateway sends requests to Gateway Handler Mapping,
 * which determines what to do with requests that match a specific route.
 * @author cm_ol
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class TribalConsultCreditGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TribalConsultCreditGatewayServerApplication.class, args);
	}

}
