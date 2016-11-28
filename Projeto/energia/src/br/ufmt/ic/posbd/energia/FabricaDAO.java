/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.energia;

import br.ufmt.ic.posbd.energia.dao.jpa.AmbienteDAOImpl;
import br.ufmt.ic.posbd.energia.dao.jpa.AparelhoDAOImpl;
import br.ufmt.ic.posbd.energia.dao.jpa.CidadeDAOImpl;
import br.ufmt.ic.posbd.energia.dao.jpa.EnderecoDAOImpl;
import br.ufmt.ic.posbd.energia.dao.jpa.ImovelDAOImpl;
import br.ufmt.ic.posbd.energia.dao.jpa.MovimentacaoDAOImpl;
import br.ufmt.ic.posbd.energia.dao.AmbienteDAO;
import br.ufmt.ic.posbd.energia.dao.AparelhoDAO;
import br.ufmt.ic.posbd.energia.dao.CidadeDAO;
import br.ufmt.ic.posbd.energia.dao.EnderecoDAO;
import br.ufmt.ic.posbd.energia.dao.ImovelDAO;
import br.ufmt.ic.posbd.energia.dao.MovimentacaoDAO;

/**
 *
 * @author pc
 */
public class FabricaDAO {
    
    public static ImovelDAO criarImovelDAO(){
        return new ImovelDAOImpl();
    }

    public static AmbienteDAO criarAmbienteDAO(){
        return new AmbienteDAOImpl();
    }

    public static AparelhoDAO criarAparelhoDAO(){
        return new AparelhoDAOImpl();
    }

    public static MovimentacaoDAO criarMovimentacaoDAO(){
        return new MovimentacaoDAOImpl();
    }

    public static CidadeDAO criarCidadeDAO(){
        return new CidadeDAOImpl();
    }

    public static EnderecoDAO criarEnderecoDAO(){
        return new EnderecoDAOImpl();
    }
}
