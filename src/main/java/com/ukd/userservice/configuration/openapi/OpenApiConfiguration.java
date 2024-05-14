package com.ukd.userservice.configuration.openapi;


import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Person Service", version = "v1"),
        servers = {@Server(url = "/", description = "Default Server URL")})
public class OpenApiConfiguration {
}
