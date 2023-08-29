package br.com.kel.example.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class HttpController {
    @GetMapping
    public String get(){
        return "GET REQUEST";
    }
    @PostMapping
    public String post(){
        return "POST REQUEST";
    }
    @PutMapping
    public String put(){
        return "PUT REQUEST";
    }
    @PatchMapping
    public String patch(){
        return "PATCH REQUEST";
    }
    @DeleteMapping
    public String delete(){
        return "DELETE REQUEST";
    }

}
