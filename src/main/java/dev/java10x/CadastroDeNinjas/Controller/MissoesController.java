package dev.java10x.CadastroDeNinjas.Controller;

import dev.java10x.CadastroDeNinjas.Models.MissoesModel;
import dev.java10x.CadastroDeNinjas.Service.MissoesService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/missoes")
public class MissoesController {
    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }
    @GetMapping
    public List<MissoesModel> getAll(){return missoesService.getAll();}

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody MissoesModel missao){missoesService.save(missao);}
}
