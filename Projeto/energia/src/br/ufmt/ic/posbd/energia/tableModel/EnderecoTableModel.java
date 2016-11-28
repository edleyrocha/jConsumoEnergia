/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.energia.tableModel;

import br.ufmt.ic.posbd.energiapostgresql.entidade.Endereco;
import br.ufmt.ic.posbd.energiapostgresql.entidade.Cidade;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class EnderecoTableModel extends AbstractTableModel {

    private List<Endereco> lista;
    private final String[] titulos = new String[]{"Id","Nome endereço","Cidade" };
    
    public EnderecoTableModel(List<Endereco> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }
    
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ret = null;
        Endereco endereco = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = endereco.getId();
                break;
            case 1:
                ret = endereco.getNome();
                break;
            case 2:
                ret = endereco.getId_cidade();
                break;
        }
        
        return ret;
    }
    
    public void atualizar(List<Endereco> lista){
        this.lista = lista;
        fireTableDataChanged();
    }
    
    public Endereco get(int index){
        return lista.get(index);
    }
    
}
