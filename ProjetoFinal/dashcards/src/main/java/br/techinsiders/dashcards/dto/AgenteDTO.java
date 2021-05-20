package br.techinsiders.dashcards.dto;

import br.techinsiders.dashcards.model.Agente;

public class AgenteDTO {
    private String nome;
    private double volumeTransacional;

    public AgenteDTO(Agente agente) {
        this.nome = agente.getNome();
        this.volumeTransacional = agente.getVolume();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolumeTransacional() {
        return volumeTransacional;
    }

    public void setVolumeTransacional(double volumeTransacional) {
        this.volumeTransacional = volumeTransacional;
    }

   
}
