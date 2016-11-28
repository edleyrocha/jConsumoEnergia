/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.energia.tableModel;

import br.ufmt.ic.posbd.energiamysql.entidade.Aparelho;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class AparelhoTableModel extends AbstractTableModel {

    private List<Aparelho> lista;
    private final String[] titulos = new String[]{"Id","Nome Aparelho","Potência"};
    
    public AparelhoTableModel(List<Aparelho> lista) {
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
        Aparelho aparelho = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = aparelho.getId();
                break;
            case 1:
                ret = aparelho.getAparelho();
                break;
            case 2:
                ret = aparelho.getPotencia();
                break;
        }
        
        return ret;
    }
    
    public void atualizar(List<Aparelho> lista){
        this.lista = lista;
        fireTableDataChanged();
    }
    
    public Aparelho get(int index){
        return lista.get(index);
    }
    
}
