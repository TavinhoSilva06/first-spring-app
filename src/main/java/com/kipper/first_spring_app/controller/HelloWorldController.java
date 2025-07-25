package com.kipper.first_spring_app.controller;

import com.kipper.first_spring_app.domain.User; // Classe que representa um modelo de usuário
import com.kipper.first_spring_app.service.HelloWorldService; // Classe de serviço que contém a lógica de negócio
import org.springframework.beans.factory.annotation.Autowired; // Injeta a dependência automaticamente
import org.springframework.web.bind.annotation.*; // Anotações usadas para mapear endpoints HTTP

@RestController // Define que essa classe será um controller REST (retorna diretamente os dados, não views)
@RequestMapping("/hello-world") // Define o prefixo do endpoint: todas as rotas dessa classe começam com /hello-world
public class HelloWorldController {

    @Autowired // Injeta a instância gerenciada de HelloWorldService
    private HelloWorldService helloWorldService;

    // Outra forma de injetar o serviço seria via construtor, como abaixo:
    // public HelloWorldController(HelloWorldService helloWorldService) {
    //     this.helloWorldService = helloWorldService;
    // }

    @GetMapping // GET /hello-world -> Rota acessada pelo navegador ou cliente HTTP
    public String helloWorld() {
        return helloWorldService.helloWorld("kipper"); // Chama o serviço e passa "kipper" como argumento
    }

    @PostMapping("/{id}") // POST /hello-world/{id} -> Rota que recebe dados via body da requisição e parâmetros
    public String helloWorldPost(
            @PathVariable("id") String id, // Captura o valor do "id" direto da URL
            @RequestParam(value = "filter", defaultValue = "nenhum") String filter, // Captura query param ?filter=x; se não enviado, assume "nenhum"
            @RequestBody User body // Captura os dados enviados no corpo da requisição como JSON e mapeia para o objeto User
    ) {
        return "Hello world " + filter; // Retorna uma saudação com o valor do filtro
    }
}