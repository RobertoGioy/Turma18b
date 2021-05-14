package br.techinsiders.dashcards.repo;

import org.springframework.data.repository.CrudRepository;

import br.techinsiders.dashcards.model.Agente;

public interface AgenteRepo extends CrudRepository<Agente, Integer> {
        
}
