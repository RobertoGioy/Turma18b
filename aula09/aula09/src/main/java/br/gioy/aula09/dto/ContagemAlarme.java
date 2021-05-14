package br.gioy.aula09.dto;

public class ContagemAlarme {
    private String nome;
    private long count;

    public ContagemAlarme(String nome, long count) {
        this.nome = nome;
        this.count = count;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

}
