package com.dazzledepot.gateway_service.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("auth", r -> r.path("/api/auth/**").uri("http://localhost:8081"))
                .route("products", r -> r.path("/api/products/**").uri("http://localhost:8082"))
                .route("categories", r -> r.path("/api/categories/**").uri("http://localhost:8083"))
                .build();
    }
}