package ru.yandex.javaqaspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
class JavaQaSpringApplicationTests {

    @Spy
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {

        Mockito.doAnswer(a -> "Hello world")
                .when(restTemplate)
                .getForObject(anyString(), any());

        String response = restTemplate.getForObject("http://localhost:8080/hello", String.class);
        Assertions.assertEquals("Hello world", response);
    }

}
