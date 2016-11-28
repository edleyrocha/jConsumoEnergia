/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.posbd.energia.gui;

import br.ufmt.ic.posbd.energia.FabricaDAO;
import br.ufmt.ic.posbd.energia.dao.CidadeDAO;
import br.ufmt.ic.posbd.energia.dao.EnderecoDAO;
import br.ufmt.ic.posbd.energia.dao.ImovelDAO;
import br.ufmt.ic.posbd.energia.dao.jpa.CidadeDAOImpl;
import br.ufmt.ic.posbd.energiamysql.entidade.Imovel;
import br.ufmt.ic.posbd.energia.tableModel.ImovelTableModel;
import br.ufmt.ic.posbd.energiapostgresql.entidade.Cidade;
import br.ufmt.ic.posbd.energiapostgresql.entidade.Endereco;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class ImovelJPanel extends javax.swing.JPanel {

    private ImovelTableModel tableModel;
    private ImovelDAO dao = FabricaDAO.criarImovelDAO();

    /**
     * Creates new form Imovel
     */
    public ImovelJPanel() {
        tableModel = new ImovelTableModel(dao.listar());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idjLabel = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        localjLabel = new javax.swing.JLabel();
        localjTextField = new javax.swing.JTextField();
        salvarjButton = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelajTable = new javax.swing.JTable();
        editarjButton = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        enderecojTextField = new javax.swing.JTextField();
        ufjTextField = new javax.swing.JTextField();
        localjLabel1 = new javax.swing.JLabel();
        cidadejButton1 = new javax.swing.JButton();
        nomecidadejTextField = new javax.swing.JTextField();
        localjLabel2 = new javax.swing.JLabel();

        idjLabel.setText("Id:");

        idjTextField.setEditable(false);
        idjTextField.setEnabled(false);

        nomejLabel.setText("Nome do Imóvel:");

        localjLabel.setText("Endereço:");

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        cancelarjButton.setText("Limpar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        tabelajTable.setModel(tableModel);
        jScrollPane1.setViewportView(tabelajTable);

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        excluirjButton.setText("Excluir");
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });

        enderecojTextField.setEditable(false);

        ufjTextField.setEditable(false);

        localjLabel1.setText("UF:");

        cidadejButton1.setText("Buscar Endereço");
        cidadejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadejButton1ActionPerformed(evt);
            }
        });

        nomecidadejTextField.setEditable(false);

        localjLabel2.setText("Cidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomejLabel)
                        .addComponent(idjLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(localjLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(excluirjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(editarjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salvarjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(localjLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(nomecidadejTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(localjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ufjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(localjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cidadejButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecojTextField))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjLabel)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localjLabel)
                    .addComponent(localjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadejButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ufjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localjLabel1)
                    .addComponent(nomecidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localjLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(salvarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirjButton)
                        .addContainerGap(102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
        /*
        if (!nomejTextField.getText().equals("")) {
            Imovel imovel = new Imovel();

            imovel.setNomeImovel(nomejTextField.getText());
            int local_novo = Integer.parseInt(localjTextField.getText());
            imovel.setLocalidade(local_novo);

            if(!idjTextField.getText().equals("")){
                int id = Integer.parseInt(idjTextField.getText());
                imovel.setId(id);
                dao.alterar(imovel);
                JOptionPane.showMessageDialog(salvarjButton,
                    "Imóvel atualizado com Sucesso!");
            }else{
                dao.inserir(imovel);
                JOptionPane.showMessageDialog(salvarjButton,
                    "Imóvel inserido com Sucesso!");
            }

            tableModel.atualizar(dao.listar());

            cancelarjButtonActionPerformed(evt);

        }else{
            JOptionPane.showMessageDialog(nomejTextField,
                "Informe o campo nome!");
            nomejTextField.grabFocus();
        }
        */         
        if (nomejTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(nomejTextField,
                "Informe o campo nome!");
            nomejTextField.grabFocus();
        }
        if (localjTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(localjTextField,
                "Informe um endereço!");
            localjTextField.grabFocus();
        }
        
        Imovel imovel = new Imovel();

        imovel.setNomeImovel(nomejTextField.getText());
        int local_novo = Integer.parseInt(localjTextField.getText());
        imovel.setLocalidade(local_novo);

        if(!idjTextField.getText().equals("")){
            int id = Integer.parseInt(idjTextField.getText());
            imovel.setId(id);
            dao.alterar(imovel);
            JOptionPane.showMessageDialog(salvarjButton,
                "Imóvel atualizado com Sucesso!");
        }else{
            dao.inserir(imovel);
            JOptionPane.showMessageDialog(salvarjButton,
                "Imóvel inserido com Sucesso!");
        }

        tableModel.atualizar(dao.listar());

        cancelarjButtonActionPerformed(evt);
    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        idjTextField.setText("");
        nomejTextField.setText("");
        localjTextField.setText("");
        enderecojTextField.setText("");
        nomecidadejTextField.setText("");
        ufjTextField.setText("");
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:
        cancelarjButtonActionPerformed(evt);
        if(tabelajTable.getSelectedRowCount() == 1){
            int linha = tabelajTable.getSelectedRow();
            Imovel edicao = tableModel.get(linha);
            nomejTextField.setText(edicao.getNomeImovel());
            localjTextField.setText(edicao.getLocalidade() + "");
            idjTextField.setText(edicao.getId() + "");
            cidadejButton1ActionPerformed(evt);
        }else{
            JOptionPane.showMessageDialog(tabelajTable,
                "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        // TODO add your handling code here:
        int[] linhas = tabelajTable.getSelectedRows();
        if(JOptionPane.showConfirmDialog(excluirjButton,
            "Deseja realmente excluir?")
        ==JOptionPane.YES_OPTION){

        for (int i = 0; i < linhas.length; i++) {
            Imovel imovel = tableModel.get(linhas[i]);
            dao.excluir(imovel.getId());
        }
        JOptionPane.showMessageDialog(tabelajTable,
            "Imóvel removido com Sucesso!");
        tableModel.atualizar(dao.listar());
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    private void cidadejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadejButton1ActionPerformed
        // TODO add your handling code here:
        if(!localjTextField.getText().equals("")) {
           int id = Integer.parseInt(localjTextField.getText());

           try {
               Endereco endereco = new Endereco();
               endereco.setId(id);
               EnderecoDAO dao2 = FabricaDAO.criarEnderecoDAO();
               enderecojTextField.setText(dao2.consultar(endereco.getId()).getNome());
               int cidade_novo = dao2.consultar(endereco.getId()).getId_cidade();

               Cidade cidade = new Cidade();
               cidade.setId(cidade_novo);
               CidadeDAO dao3 = FabricaDAO.criarCidadeDAO();

               nomecidadejTextField.setText(dao3.consultar(cidade.getId()).getNome());
               ufjTextField.setText(dao3.consultar(cidade.getId()).getUf());
               
            } catch (Exception e) {
                enderecojTextField.setText("");
                JOptionPane.showMessageDialog(cidadejButton1, "Endereço não encontrada!");
            }
        }else{
           JOptionPane.showMessageDialog(cidadejButton1, "Endereço não encontrada!");
        }
    }//GEN-LAST:event_cidadejButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JButton cidadejButton1;
    private javax.swing.JButton editarjButton;
    private javax.swing.JTextField enderecojTextField;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel localjLabel;
    private javax.swing.JLabel localjLabel1;
    private javax.swing.JLabel localjLabel2;
    private javax.swing.JTextField localjTextField;
    private javax.swing.JTextField nomecidadejTextField;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JTable tabelajTable;
    private javax.swing.JTextField ufjTextField;
    // End of variables declaration//GEN-END:variables
}