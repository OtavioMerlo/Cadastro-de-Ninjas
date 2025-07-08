package dev.java10x.CadastroDeNinjas.Service;


import dev.java10x.CadastroDeNinjas.Models.NinjaModel;
import dev.java10x.CadastroDeNinjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //listar
    public List<NinjaModel> getAll(){
        return ninjaRepository.findAll();
    }
    //Criar
    public NinjaModel save(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }
    //Delete
    public void delete(Long id){
        ninjaRepository.deleteById(id);
    }
}
