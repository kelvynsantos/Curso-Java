package br.com.kel.example.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
//    @RequestMapping (method = RequestMethod.GET, path = "/hello")
    @GetMapping(path = {"/hello", "/ola"})
    public String hello() {
        return "hello Spring Boot";
    }

    @PostMapping(path="/ola")
    public String saudacao(){
        return "Ola String Boot (POST)";
    }

}
