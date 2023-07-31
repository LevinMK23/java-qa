package ru.yandex.javaqaspring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    public String getHelloMessage() {
        return "Hello world";
    }

}
