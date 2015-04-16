/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Complemento.AtualizarArqui;
import Complemento.LerArquivo;
import Criptografia.Descriptografa;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class ListaSenha extends javax.swing.JFrame {
    private String [] Coluna =  {"Local","Usuario","Senha","Data Criação", "Data Modificação"} ;
    private DefaultTableModel Model = new DefaultTableModel(Coluna,0); 
    private int linha;
    
    
    public ListaSenha() {
        initComponents();  
        IniciaTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBADICI = new javax.swing.JButton();
        jBALTER = new javax.swing.JButton();
        jBREMOV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Senhas");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Local", "Usuario", "Senha", "Data Criação", "Data Ateração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTabela);
        jTabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jBADICI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBADICI.setText("ADICIONAR");
        jBADICI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBADICIActionPerformed(evt);
            }
        });

        jBALTER.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBALTER.setText("ATERAR");
        jBALTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBALTERActionPerformed(evt);
            }
        });

        jBREMOV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBREMOV.setText("REMOVER");
        jBREMOV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBREMOVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBADICI, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jBALTER, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jBREMOV, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBADICI, jBALTER, jBREMOV});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBADICI)
                    .addComponent(jBALTER)
                    .addComponent(jBREMOV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBADICIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBADICIActionPerformed
        AddSenha addsenha = new AddSenha();
        addsenha.show();
        this.show(false);
    }//GEN-LAST:event_jBADICIActionPerformed

    private void jBALTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBALTERActionPerformed
        SelecionaLinha();
        
    }//GEN-LAST:event_jBALTERActionPerformed

    private void jBREMOVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBREMOVActionPerformed
        // TODO add your handling code here:
        Deletar();                         
        
    }//GEN-LAST:event_jBREMOVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSenha().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBADICI;
    private javax.swing.JButton jBALTER;
    private javax.swing.JButton jBREMOV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
    //CARREGA TABELA COM ARQUIVOS
    public void IniciaTabel(){
        jTabela.setModel(Model);
        LerArquivo lerArqui;
        lerArqui = new LerArquivo("Local");
        if(lerArqui.ExisteArquivo()){
        String estalinha[] = {"","","","",""};  
        Descriptografa descriptografa;        
        int col;
        
        // Local        
        col = 0;
        lerArqui = new LerArquivo("Local");        
        for(int x = 0; x < lerArqui.linha().size(); x++){                    
            Model.addRow(estalinha);            
            descriptografa = new Descriptografa(lerArqui.linha().get(x));
            //Descriptografa descriptografa = new Descriptografa(lerArqui.linha().get(x));
            Model.setValueAt(descriptografa.getSenhaDescr(), x, col);
            //Model.setValueAt(lerArqui.linha().get(x), x, col);                  
           
        
        }
        
        // Usuario
        col = 1;
        lerArqui = new LerArquivo("Usuario");        
        for(int x =0; x < lerArqui.linha().size(); x++){                        
            descriptografa = new Descriptografa(lerArqui.linha().get(x));
            Model.setValueAt(descriptografa.getSenhaDescr(), x, col);
            //Model.setValueAt(lerArqui.linha().get(x), x, col);        
        }
        
        //Senha
        col = 2;
        lerArqui = new LerArquivo("Senha");        
        for(int x =0; x < lerArqui.linha().size(); x++){
            descriptografa = new Descriptografa(lerArqui.linha().get(x));
            Model.setValueAt(descriptografa.getSenhaDescr(), x, col);
            //Model.setValueAt(lerArqui.linha().get(x), x, col);        
        }
        //Data de Cração
        col = 3;
        lerArqui = new LerArquivo("DataCriac");        
        for(int x =0; x < lerArqui.linha().size(); x++){
            descriptografa = new Descriptografa(lerArqui.linha().get(x));
            Model.setValueAt(descriptografa.getSenhaDescr(), x, col);
            //Model.setValueAt(lerArqui.linha().get(x), x, col);        
        }
        //Data de Modificação
        col = 4;
        lerArqui = new LerArquivo("DataModif");
        for(int x =0; x < lerArqui.linha().size(); x++){
            descriptografa = new Descriptografa(lerArqui.linha().get(x));
            Model.setValueAt(descriptografa.getSenhaDescr(), x, col);            
        }
        }
    }
    //SELECIONA LINHA
    private void SelecionaLinha(){
        linha =  jTabela.getSelectedRow();
        if(linha ==-1){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE UM ARQUIVO");
        }else{           
            jTabela.setModel(Model); 
            VerSenha versenha = new VerSenha();
            versenha.setRecebLinha(linha);
            versenha.jTLOCAL.setText(String.valueOf(jTabela.getValueAt(jTabela.getSelectedRow(), 0)));
            versenha.jTUSUARIO.setText(String.valueOf(jTabela.getValueAt(jTabela.getSelectedRow(), 1)));
            versenha.jTSENHA.setText(String.valueOf(jTabela.getValueAt(jTabela.getSelectedRow(), 2)));
            versenha.show();
            ListaSenha.this.dispose();
        }
    }  
    
    public void Deletar(){         
        if (JOptionPane.showConfirmDialog(rootPane,"EXCLUIR INFORMAÇÕES")==JOptionPane.OK_OPTION){              
            AtualizarArqui at;
            at = new AtualizarArqui(jTabela.getSelectedRow(), "Local", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(jTabela.getSelectedRow(), "Usuario", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(jTabela.getSelectedRow(), "Senha", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(jTabela.getSelectedRow(), "DataCriac", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(jTabela.getSelectedRow(), "DataModif", "");        
            at.DeletaArquivo(); 
            //Finaliza
            this.dispose();
            new ListaSenha().show();
        }
    }
    
    /*jTabela.addMouseListener(new java.awt.event.MouseAdapter(){  
        public void mouseClicked(java.awt.event.MouseEvent evt){  
            if(evt.getClickCount()==2){  
                //faça algo  
            }  
        }  
    });  */           
}