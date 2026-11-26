package dev.psicogi.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controlador para API REST
// controller -> é o "guia" entre o usuario e o destino final
@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "primeira mensagem dessa rota";
    }
}
