package br.techinsiders.dashcards.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.techinsiders.dashcards.dto.TransacaoDTO;
import br.techinsiders.dashcards.model.Transacao;

public interface TransacaoRepo extends CrudRepository<Transacao, Integer> {
    
    @Query("SELECT new br.techinsiders.dashcards.dto.TransacaoDTO(t.agFinanceiro.nome, t.agFinanceiro.volume, t.status, COUNT(t.status)) FROM Transacao AS t WHERE t.agFinanceiro.id = ?1 GROUP BY t.agFinanceiro.nome, t.status ORDER By t.status")
    public List<TransacaoDTO> countStatusByAgent(int idAgente);

}
