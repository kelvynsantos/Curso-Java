package br.com.kel.example.controllers;

import br.com.kel.example.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(21,"Pedro","123.987.567-43");

    }
}
