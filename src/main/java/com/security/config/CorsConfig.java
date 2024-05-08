package com.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Mapea todas las URL
                .allowedOrigins("http://localhost:4200") // Permite solicitudes desde localhost:4200
                .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS") // Métodos HTTP permitidos
                .allowedHeaders("Origin","Content-Type","Acept","Authorization") // Encabezados permitidos
                .allowCredentials(true)// Permite el envío de cookies en las solicitudes CORS
                .maxAge(3600); // Tiempo máximo de caché para la respuesta preflight en segundos
        
        registry.addMapping("/auth/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS")
                .allowedHeaders("Origin","Content-Type","Acept","Authorization")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
