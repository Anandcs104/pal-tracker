package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    String Hello = "hello";

    public WelcomeController(@Value("${welcome.message}") String message) {
        this.Hello = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return Hello;
    }
}