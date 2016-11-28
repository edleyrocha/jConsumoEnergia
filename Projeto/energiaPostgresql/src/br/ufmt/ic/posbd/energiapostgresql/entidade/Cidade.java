/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.energiapostgresql.entidade;

import br.ufmt.ic.posbd.energiamysql.entidade.ICRUD;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "cidade")
@SequenceGenerator(allocationSize = 1, sequenceName = "cidade_id_seq", name = "seqCidade")
public class Cidade implements ICRUD {
    
    @Id
    @GeneratedValue(generator = "seqCidade", strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "nome", length = 255)
    private String nome;
    @Column(name = "uf", length = 2)
    private String uf;

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
    
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
}
