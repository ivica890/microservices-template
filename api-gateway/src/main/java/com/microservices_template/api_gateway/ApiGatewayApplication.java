package com.microservices_template.api_gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ApiGatewayApplication {

	@Value("${spring.cloud.gateway.routes[0].uri}")
	private String loansServiceUrl;

	@Value("${spring.cloud.gateway.routes[1].uri}")
	private String accountsServiceUrl;

	@Value("${spring.cloud.gateway.routes[2].uri}")
	private String cardsServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("loans", r -> r.path("/api/loans/**")
						.filters(f -> f.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
						.uri(loansServiceUrl))
				.route("accounts", r -> r.path("/api/accounts/**")
						.filters(f -> f.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
						.uri(accountsServiceUrl))
				.route("cards", r -> r.path("/api/cards/**")
						.filters(f -> f.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
						.uri(cardsServiceUrl))
				.build();
	}
}
