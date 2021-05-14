package br.gioy.aula09.repo;

import org.springframework.data.repository.CrudRepository;
import br.gioy.aula09.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);
}
