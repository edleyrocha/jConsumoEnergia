/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.energia.tableModel;

import br.ufmt.ic.posbd.energiamysql.entidade.Imovel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class ImovelTableModel extends AbstractTableModel {

    private List<Imovel> lista;
    private final String[] titulos = new String[]{"Id",
        "Nome","Localidade"};
    
    public ImovelTableModel(List<Imovel> lista) {
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
        Imovel imovel = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                ret = imovel.getId();
                break;
            case 1:
                ret = imovel.getNomeImovel();
                break;
            case 2:
                ret = imovel.getLocalidade();
                break;
        }
        
        return ret;
    }
    
    public void atualizar(List<Imovel> lista){
        this.lista = lista;
        fireTableDataChanged();
    }
    
    public Imovel get(int index){
        return lista.get(index);
    }
    
}
