package br.techinsiders.dashcards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.techinsiders.dashcards.dto.AgenteDTO;
import br.techinsiders.dashcards.model.Agente;
import br.techinsiders.dashcards.repo.AgenteRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/agente")
public class AgenteController {
    
    @Autowired
    private AgenteRepo agenteRepo;

    @GetMapping("/id/{id}") // { nome do parametro }
    public ResponseEntity<AgenteDTO> getUser (@PathVariable int id) {
        Agente agente = agenteRepo.findById(id).orElse(null);

        if (agente != null) {
            AgenteDTO agenteDTO = new AgenteDTO (agente);
            return ResponseEntity.ok(agenteDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Agente> getAll() {
        List<Agente> lista = (List<Agente>) agenteRepo.findAll();
        return lista;
    }
}
