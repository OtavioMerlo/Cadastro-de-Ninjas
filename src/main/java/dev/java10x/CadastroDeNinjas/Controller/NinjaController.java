package dev.java10x.CadastroDeNinjas.Controller;

import dev.java10x.CadastroDeNinjas.Models.NinjaModel;
import dev.java10x.CadastroDeNinjas.Service.NinjaService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public List<NinjaModel> getAll(){ return ninjaService.getAll();}

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public NinjaModel create(@RequestBody NinjaModel ninja){return ninjaService.save(ninja);}
}
