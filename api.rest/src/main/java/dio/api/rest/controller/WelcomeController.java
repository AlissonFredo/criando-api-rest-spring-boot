package dio.api.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Bem vindo a minha API Web Spring Boot";
    }
}
