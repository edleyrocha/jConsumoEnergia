/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.energiamysql.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "imovel")
public class Imovel implements ICRUD {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome_imovel", length = 255)
    private String nome_imovel;
    @Column(name = "localidade")
    private int localidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeImovel() {
        return nome_imovel;
    }

    public void setNomeImovel(String nomeimovel) {
        this.nome_imovel = nomeimovel;
    }

    public int getLocalidade() {
        return localidade;
    }

    public void setLocalidade(int localidade) {
        this.localidade = localidade;
    }
}
