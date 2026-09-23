package py.edu.uc.lp3.clbasualdo.minecraft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.clbasualdo.minecraft.Entidad;
import py.edu.uc.lp3.clbasualdo.minecraft.Creeper;
import py.edu.uc.lp3.clbasualdo.minecraft.Aldeano;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class ComportamientoController {

    @GetMapping("/comportamiento")
    public List<Map<String, String>> comportamiento() {
        List<Entidad> entidades = List.of(new Creeper(), new Aldeano());

        return entidades.stream()
                .map(e -> Map.of(
                        "tipo", e.getClass().getSimpleName(),
                        "reaccion", e.reaccionar()
                ))
                .collect(Collectors.toList());
    }
}
