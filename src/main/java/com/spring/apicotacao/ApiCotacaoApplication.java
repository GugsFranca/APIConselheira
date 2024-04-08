package com.spring.apicotacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiCotacaoApplication {

    public static void main(String[] args) {
        SpringApplication. run(ApiCotacaoApplication.class, args);
    }

}
