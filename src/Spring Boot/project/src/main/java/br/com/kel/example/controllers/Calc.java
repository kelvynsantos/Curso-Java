//package br.com.kel.example.controllers;
//
//import br.com.kel.example.models.Cliente;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/calc")
//public class Calc {
//
//    @GetMapping("/{id}")
//    public Cliente obterCli1(@PathVariable int id){
//        return new Cliente(id, "Maria", "987.133.321-00");
//    }
//
//    @GetMapping("/somar/{a}/{b}")
//    public int somar(@RequestParam(name = "a")int a,@RequestParam(name = "b") int b) {
//        return a + b;
//    }
//
////    @GetMapping("/somar")
//    public int subtrair(@PathVariable int a , @PathVariable int b) {
//        return a + b;
//    }
//}
