package br.techinsiders.dashcards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.techinsiders.dashcards.model.Usuario;
import br.techinsiders.dashcards.repo.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepo usuarioRepo;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login (@RequestBody Usuario userParam) {
        Usuario user = usuarioRepo.findByEmailOrRacf(userParam.getEmail(), userParam.getRacf());

        if(user != null) {
            if (userParam.getSenha().equals(user.getSenha())) {
                return ResponseEntity.ok(user);
            }
        }
        return ResponseEntity.status(401).build();
    }
}
