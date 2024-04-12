package com.reverse.phonepe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @RestController
    class HelloController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, Spring Boot!";
        }
    }
}
