package com.kipper.first_spring_app;

import org.springframework.boot.SpringApplication; // Classe que inicializa a aplicação
import org.springframework.boot.autoconfigure.SpringBootApplication; // Anotação que configura automaticamente a aplicação Spring

@SpringBootApplication // Combina @Configuration, @EnableAutoConfiguration e @ComponentScan
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args); // Ponto de entrada da aplicação Spring
	}

}