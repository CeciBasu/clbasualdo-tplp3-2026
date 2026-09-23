package py.edu.uc.lp3.clbasualdo.minecraft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.clbasualdo.minecraft.Esqueleto;

import java.util.Map;

@RestController
public class EsqueletoController {

    @GetMapping("/esqueleto")
    public Map<String, Object> crear(
            @RequestParam(defaultValue = "Esqueleto") String nombre,
            @RequestParam(defaultValue = "20") int vida) {

        Esqueleto esqueleto = new Esqueleto(nombre, vida);

        return Map.of(
                "nombre", esqueleto.getNombre(),
                "vida", esqueleto.getVida(),
                "vivo", esqueleto.estaVivo()
        );
    }
}
