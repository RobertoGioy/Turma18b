package br.techinsiders.dashcards.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
    @Autowired // injeção de dependencia
    private AgenteRepo repo;

    @GetMapping("/all")
    public List<Agente> getAll() {
       // List<Agente> lista = (List<Agente>) repo.findAll();
       List<Agente> lista = repo.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return lista;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<AgenteDTO> getId(@PathVariable int id) {
        Agente agente = repo.findById(id).orElse(null);
        if (agente != null) {
            AgenteDTO agenteDTO = new AgenteDTO(agente);
            return ResponseEntity.ok(agenteDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/top10")
    public List<Agente> getTop10() {
       List<Agente> lista = repo.findAll(Sort.by(Sort.Direction.DESC, "volume"));
        return lista;
    }
}
