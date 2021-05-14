package br.gioy.aula09.repo;

import org.springframework.data.repository.CrudRepository;

import br.gioy.aula09.model.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme, Integer> {
    
}
