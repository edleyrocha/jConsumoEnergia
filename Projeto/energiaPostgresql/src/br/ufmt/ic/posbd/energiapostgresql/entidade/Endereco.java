/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.energiapostgresql.entidade;

import br.ufmt.ic.posbd.energiamysql.entidade.ICRUD;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "endereco")
@SequenceGenerator(allocationSize = 1, sequenceName = "endereco_id_seq",name = "seqEndereco")
public class Endereco implements ICRUD {
    
    @Id
    @GeneratedValue(generator = "seqEndereco", strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "nome", length = 255)
    private String nome;
    @Column(name = "id_cidade")
    private int id_cidade;

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
    
    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }
    
}
