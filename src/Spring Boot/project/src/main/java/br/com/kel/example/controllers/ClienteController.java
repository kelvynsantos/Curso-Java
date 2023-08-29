package br.com.kel.example.controllers;

import br.com.kel.example.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(21,"Pedro","123.987.567-43");

    }
    @GetMapping("/{id}")
    public Cliente obterCli1(@PathVariable int id){
        return new Cliente(id, "Maria", "987.133.321-00");
    }
    @GetMapping
    public Cliente obterClie2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Joao","112.546.234-64");
    }
}
