package br.techinsiders.dashcards.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mtb310_transaction")
public class Transacao {
    @Id // indica primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_transacao ")
    private int id;

    @Column(name = "data_hora")
    private LocalDate data;

    @Column(name = "dispositivo")
    private int dispositivo;

    @Column(name = "valor_solic ")
    private float valorSolicitado;

    @Column(name = "valor_aut ")
    private float valorAut;

    @Column(name = "status")
    private int status;
    
    @OneToOne
    @JoinColumn(name = "ag_financeiro")
    private Agente agFinanceiro ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }

    public float getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(float valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public float getValorAut() {
        return valorAut;
    }

    public void setValorAut(float valorAut) {
        this.valorAut = valorAut;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Agente getAgFinanceiro() {
        return agFinanceiro;
    }

    public void setAgFinanceiro(Agente agFinanceiro) {
        this.agFinanceiro = agFinanceiro;
    }

}