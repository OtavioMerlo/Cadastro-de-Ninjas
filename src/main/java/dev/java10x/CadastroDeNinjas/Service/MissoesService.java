package dev.java10x.CadastroDeNinjas.Service;


import dev.java10x.CadastroDeNinjas.Models.MissoesModel;
import dev.java10x.CadastroDeNinjas.Models.NinjaModel;
import dev.java10x.CadastroDeNinjas.Repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {
    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //listar
    public List<MissoesModel> getAll(){
        return missoesRepository.findAll();
    }
    //Criar
    public MissoesModel save(MissoesModel missao) {
        return missoesRepository.save(missao);
    }
}
