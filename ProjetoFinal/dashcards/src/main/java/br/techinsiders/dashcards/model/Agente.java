package br.techinsiders.dashcards.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mtb310_ag_financeiro")
public class Agente {

    @Id // indica primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_agente", nullable = false)
    private int id;

    @Column(name = "nome_agente", length = 100)
    private String nome;

    @Column(name = "volume_transacional")
    private double volume;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
