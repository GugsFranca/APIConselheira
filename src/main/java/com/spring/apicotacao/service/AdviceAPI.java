package com.spring.apicotacao.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "conselho", url = "https://api.adviceslip.com")
public interface AdviceAPI {

    @GetMapping("/advice")
    String obterConselho();
}
