package com.kipper.first_spring_app.configuration;

import org.springframework.context.annotation.Bean; // @Bean -> Marca um método que retorna um objeto gerenciado pelo Spring (um bean)
import org.springframework.context.annotation.Configuration; // @Configuration -> Indica que esta classe contém configurações do Spring

@Configuration // Classe de configuração do Spring. Toda configuração de beans manual deve estar aqui.
public class HelloConfiguration {

    @Bean // Registra o retorno deste método no contexto do Spring como um bean (String helloWorld será um bean disponível no container)
    public String helloWorld() {
        return "Hello World"; // Valor simples de retorno usado como exemplo de bean
    }

}

//public Transport myService() {
//    return new Car();
//}
// Transport -> interface
// Car -> implementação da interface Transport