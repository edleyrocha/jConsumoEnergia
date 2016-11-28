/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.energia.tableModel;

import br.ufmt.ic.posbd.energiapostgresql.entidade.Cidade;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class CidadeTableModel extends AbstractTableModel {

    private List<Cidade> lista;
    private final String[] titulos = new String[]{"Id","Nome Cidade","UF" };
    
    public CidadeTableModel(List<Cidade> lista) {
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
        Cidade cidade = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = cidade.getId();
                break;
            case 1:
                ret = cidade.getNome();
                break;
            case 2:
                ret = cidade.getUf();
                break;
        }
        
        return ret;
    }
    
    public void atualizar(List<Cidade> lista){
        this.lista = lista;
        fireTableDataChanged();
    }
    
    public Cidade get(int index){
        return lista.get(index);
    }
    
}
