package br.gioy.aula09.repo;

import org.springframework.data.repository.CrudRepository;

import br.gioy.aula09.model.Equipamento;

public interface EquipamentoRepo extends CrudRepository<Equipamento, Integer> {
    
}
