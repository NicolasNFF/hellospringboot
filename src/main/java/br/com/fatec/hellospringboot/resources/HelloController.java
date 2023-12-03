package br.com.fatec.hellospringboot.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello") // mapeamento
    public String hello() {
        return "hello Spring Boot";
    }

}
