/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.energia;

import br.ufmt.ic.posbd.energia.dao.CidadeDAO;
import br.ufmt.ic.posbd.energia.dao.ImovelDAO;
import br.ufmt.ic.posbd.energia.dao.jpa.CidadeDAOImpl;
import br.ufmt.ic.posbd.energia.gui.PrincipalJFrame;
import br.ufmt.ic.posbd.energiamysql.entidade.Imovel;
import br.ufmt.ic.posbd.energiapostgresql.entidade.Cidade;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrincipalJFrame tela = new PrincipalJFrame();
        tela.setVisible(true);
        
//        Imovel imovel = new Imovel();
//        imovel.setId(1);
//        imovel.setNomeImovel("Casa Leonardo");
//
//        ImovelDAO dao = FabricaDAO.criarImovelDAO();
//        dao.alterar(imovel);        

//           Cidade cidade = new Cidade();
//           cidade.setId(1);
//           
//           CidadeDAO dao = FabricaDAO.criarCidadeDAO();
//           System.out.println(dao.consultar(1).getNome());

    }
    
}
