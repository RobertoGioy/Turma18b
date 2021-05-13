package br.gioy.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gioy.spring02.repo.ContaRepo;
import br.gioy.spring02.model.Conta;

@RestController
@CrossOrigin("*")
@RequestMapping("/conta")
public class ContaController {
    
    @Autowired
    private ContaRepo repo;

    @GetMapping("/numero/{numero}")
    public ResponseEntity<Conta> getConta (@PathVariable int numero) {
        Conta conta = repo.findById(numero).orElse(null);

        if (conta != null) {
            return ResponseEntity.ok(conta);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Conta> getAll () {
        List<Conta> lista = (List<Conta>) repo.findAll();

        return lista;
    }
}
