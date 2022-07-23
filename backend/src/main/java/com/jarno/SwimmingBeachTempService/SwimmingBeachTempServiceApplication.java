package com.jarno.SwimmingBeachTempService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SwimmingBeachTempServiceApplication {

	private final String allowedOrigins = "http://localhost:4200";

	public static void main(String[] args) {
		SpringApplication.run(SwimmingBeachTempServiceApplication.class, args);
	}

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/status");
				registry.addMapping("/features")
					.allowedOrigins(allowedOrigins);
			}
		};
	}

}
