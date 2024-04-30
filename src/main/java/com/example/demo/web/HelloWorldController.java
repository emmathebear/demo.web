package com.example.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao " + nome + ", " + "com'è il tempo in " + provincia + "?";
    }
}
