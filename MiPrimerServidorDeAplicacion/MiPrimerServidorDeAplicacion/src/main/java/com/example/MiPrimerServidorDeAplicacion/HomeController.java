package com.example.MiPrimerServidorDeAplicacion;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "Hola mundo desde mi aplicacion";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "Hola: "+ nombre + " desde mi servidor de aplicacion";
    }
    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){
        return "Recibi el mensaje: "+mensaje;
    }
}
