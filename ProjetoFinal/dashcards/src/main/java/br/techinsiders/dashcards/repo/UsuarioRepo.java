package br.techinsiders.dashcards.repo;

import org.springframework.data.repository.CrudRepository;
import br.techinsiders.dashcards.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);
}
