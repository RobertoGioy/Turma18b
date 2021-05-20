package br.techinsiders.dashcards.repo;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import br.techinsiders.dashcards.model.Agente;

public interface AgenteRepo extends CrudRepository<Agente, Integer> {
    public List<Agente> findAll(Sort by);
}
