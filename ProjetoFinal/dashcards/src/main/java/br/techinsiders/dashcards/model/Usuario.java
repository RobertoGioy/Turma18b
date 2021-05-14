package br.techinsiders.dashcards.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "linkfoto", length = 200, nullable = true)
    private String linkFoto;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "racf", length = 7, nullable = false, unique = true)
    private String racf;

    @Column(name = "senha", length = 7, nullable = true)
    private String senha;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLinkFoto() {
        return linkFoto;
    }
    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRacf() {
        return racf;
    }
    public void setRacf(String racf) {
        this.racf = racf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }   
}
