package com.tribal.credit.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

/**
 * This class contains all spring-based configuration
 * @author cm_ol
 *
 */
@Configuration
public class AppConfig {

	
	/**
	 * Configuration for OpenAPI
	 * @return openApi configuration
	 */
	public OpenAPI createServiceProviderOpenAPI() {
		return new OpenAPI().info(new Info().title("Tribal Credit Line")
				.description("Service that determine the credit line of customers.")
				.version("1.0.0")
				.contact(new Contact().name("Tribal Devs Team").email("_tribal_devs@email.com")));
	}
}
