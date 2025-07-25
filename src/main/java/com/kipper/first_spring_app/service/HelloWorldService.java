package com.kipper.first_spring_app.service;

import org.springframework.stereotype.Service; // Marca a classe como componente de serviço

@Service // Indica que esta classe é um serviço e pode ser injetada onde necessário
public class HelloWorldService {

    // Método público que retorna a mensagem personalizada
    public String helloWorld(String name) {
        return "Hello World!" + name; // Retorna a saudação com o nome passado
    }
}