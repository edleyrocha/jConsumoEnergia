/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.posbd.energia.tableModel;

import br.ufmt.ic.posbd.energiamysql.entidade.Movimentacao;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class MovimentacaoTableModel extends AbstractTableModel {

    private List<Movimentacao> lista;
    private final String[] titulos = new String[]{"Id","Imovel","Ambiente",
                              "Aparelho","Potencia","Mes",
                              "Ano","Quantidade","Horas por mes",
                              "Valor" };
    
    public MovimentacaoTableModel(List<Movimentacao> lista) {
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
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ret = null;
        Movimentacao movimentacao = lista.get(rowIndex);

        switch(columnIndex){
            case 0:
                ret = movimentacao.getId();
                break;
            case 1:
                ret = movimentacao.getImovel();
                break;
            case 2:
                ret = movimentacao.getAmbiente();
                break;
            case 3:
                ret = movimentacao.getAparelho();
                break;
            case 4:
                ret = movimentacao.getAparelho();
                break;
            case 5:
                ret = movimentacao.getMes();
                break;
            case 6:
                ret = movimentacao.getAno();
                break;
            case 7:
                ret = movimentacao.getQuantidade();
                break;
            case 8:
                ret = movimentacao.getHoras_mes();
                break;
            case 9:
                ret = movimentacao.getValor();
                break;
        }
        
        return ret;
    }
    
    public void atualizar(List<Movimentacao> lista){
        this.lista = lista;
        fireTableDataChanged();
    }
    
    public Movimentacao get(int index){
        return lista.get(index);
    }
    
}
