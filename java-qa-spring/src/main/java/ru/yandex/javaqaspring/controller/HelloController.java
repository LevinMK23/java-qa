package ru.yandex.javaqaspring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.yandex.javaqaspring.service.HelloService;
import ru.yandex.javaqaspring.service.UserNameService;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class HelloController {

    private final HelloService helloService;
    private final UserNameService userNameService;

    // GET localhost:8080/hello
    @GetMapping
    public String getMessage() {
        return helloService.getHelloMessage();
    }

    @GetMapping("/name")
    public String getName(@RequestParam("uid") String uid) {
        return userNameService.getNameByUid(uid);
    }

}
