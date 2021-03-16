package com.pirani.devops;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@OpenAPIDefinition(
		info = @Info(
				title = "Prueba api",
				version = "1.0",
				description = "OAS"
		)
)
public class DevopsDemoApplication {

	@GetMapping(path = "/", produces = "application/json")
	public Map<String, String> index(){
		Map<String, String> response = new HashMap<>();
		response.put("message", "Hello world!");
		return response;
	}
	@GetMapping(path = "/unitTest", produces = "application/json")
	public Map<String, String> unitTest(){
		Map<String, String> response = new HashMap<>();
		response.put("unitTest", "Success");
		return response;
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
