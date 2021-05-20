package br.techinsiders.dashcards.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.techinsiders.dashcards.dto.TransacaoDTO;
import br.techinsiders.dashcards.repo.TransacaoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/transacao")
public class TransacaoController {
    
    @Autowired
    private TransacaoRepo transRepo;

    @GetMapping("/agente/{id}") // { nome do parametro }
    public List<TransacaoDTO> countTransacoesPorAgente (@PathVariable int id) {

        List<TransacaoDTO> lista = transRepo.countStatusByAgent(id);
        return lista;
    }
}
