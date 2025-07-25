package com.kipper.first_spring_app.domain;

//@Getter, @Setter, @AllArgsConstructor -> Anotações do Lombok para evitar boilerplate (getters, setters e construtores)

public class User { // Classe que representa o usuário
    private String name; // Nome do usuário
    private String email; // Email do usuário

    // Construtor com todos os atributos
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Métodos Getter e Setter para acessar/modificar os campos
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}