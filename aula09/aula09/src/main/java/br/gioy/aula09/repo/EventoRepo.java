package br.gioy.aula09.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.gioy.aula09.dto.ContagemAlarme;
import br.gioy.aula09.model.Evento;

public interface EventoRepo extends CrudRepository<Evento, Integer> {
    public List<Evento> findByDataEvtBetween(LocalDate dataini, LocalDate datafim);

    @Query("Select new br.gioy.aula09.dto.ContagemAlarme(e.alarme.nome, Count(e.alarme.nome)) From Evento as e Where e.dataEvt = ?1 Group By e.alarme.nome")
    public List<ContagemAlarme> countAlarmePorTipo(LocalDate data);

}
