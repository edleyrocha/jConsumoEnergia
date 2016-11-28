/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.energiamysql.entidade;

import br.ufmt.ic.posbd.energiamysql.entidade.ICRUD;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "movimentacao")
public class Movimentacao implements ICRUD {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "id_imovel")
    private int id_imovel;
    @Column(name = "id_ambiente")
    private int id_ambiente;
    @Column(name = "id_aparelho")
    private int id_aparelho;
    @Column(name = "mes")
    private int mes;
    @Column(name = "ano")
    private int ano;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "horas_mes")
    private int horas_mes;            
    @Column(name = "valor")
    private Float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImovel() {
        return id_imovel;
    }

    public void setImovel(int id_imovel) {
        this.id_imovel = id_imovel;
    }
    
    public int getAmbiente() {
        return id_ambiente;
    }

    public void setAmbiente(int id_ambiente) {
        this.id_ambiente = id_ambiente;
    }
    
    public int getAparelho() {
        return id_aparelho;
    }

    public void setAparelho(int id_aparelho) {
        this.id_aparelho = id_aparelho;
    }
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getHoras_mes() {
        return horas_mes;
    }

    public void setHoras_mes(int horas_mes) {
        this.horas_mes = horas_mes;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
