package com.spring.integration.demo.httpintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableIntegration
public class HttpIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpIntegrationApplication.class, args);
	}

}

@RestController
class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return String.format("Welcome to %s", this.getClass().getSimpleName()
		);
	}
}
