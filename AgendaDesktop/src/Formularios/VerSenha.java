/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Complemento.AtualizarArqui;
import Criptografia.Criptografa;
import Logica.Senha;
import java.awt.Dimension;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class VerSenha extends javax.swing.JFrame {
    private Senha senha;
    private int RecebLinha;
    /**
     * Creates new form VerSenha
     */
    public VerSenha() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setDefaultCloseOperation(NORMAL);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTLOCAL = new javax.swing.JTextField();
        jTSENHA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPNOVASENHA = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNOTA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPCONFISENHA = new javax.swing.JPasswordField();
        jTUSUARIO = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jBALTERAR = new javax.swing.JButton();
        jBEXCLUIR = new javax.swing.JButton();
        jBVOLTAR = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("LOCAL: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("USUARIO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SENHA:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" NOVA SENHA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("NOTA:");

        jTNOTA.setColumns(20);
        jTNOTA.setRows(5);
        jScrollPane1.setViewportView(jTNOTA);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CONFIRMAR SENHA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTLOCAL, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTSENHA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPNOVASENHA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jPCONFISENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTLOCAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPNOVASENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPCONFISENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jBALTERAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBALTERAR.setText("ALTERAR");
        jBALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBALTERARActionPerformed(evt);
            }
        });

        jBEXCLUIR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBEXCLUIR.setText("EXCLUIR");
        jBEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEXCLUIRActionPerformed(evt);
            }
        });

        jBVOLTAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBVOLTAR.setText("VOLTAR");
        jBVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVOLTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jBALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jBALTERAR)
                .addComponent(jBEXCLUIR)
                .addComponent(jBVOLTAR))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBALTERARActionPerformed
        // TODO add your handling code here:
        Atualizar();
    }//GEN-LAST:event_jBALTERARActionPerformed

    private void jBEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEXCLUIRActionPerformed
        // TODO add your handling code here:
        Deletar();
                
    }//GEN-LAST:event_jBEXCLUIRActionPerformed

    private void jBVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVOLTARActionPerformed
        // TODO add your handling code here:
        Finaliza();
    }//GEN-LAST:event_jBVOLTARActionPerformed

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
            java.util.logging.Logger.getLogger(VerSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerSenha().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBALTERAR;
    private javax.swing.JButton jBEXCLUIR;
    private javax.swing.JButton jBVOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPasswordField jPCONFISENHA;
    public javax.swing.JPasswordField jPNOVASENHA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTLOCAL;
    private javax.swing.JTextArea jTNOTA;
    public javax.swing.JTextField jTSENHA;
    public javax.swing.JTextField jTUSUARIO;
    // End of variables declaration//GEN-END:variables
   //COMPARA SENHA
    private boolean comparaSenha(){
        boolean retorna;
        retorna = false;
        String estasenha;
        String confiSenha;
        estasenha = String.valueOf(jPNOVASENHA.getPassword());
        confiSenha = String.valueOf(jPCONFISENHA.getPassword());
        if(estasenha.equals(confiSenha) ){
            if(!estasenha.equals("")){
            retorna = true;
            }
        }
        return retorna;
        }
    private void JTParaClass(){
        senha = new Senha();
        Criptografa criptografia;
        // Local
        criptografia = new Criptografa(jTLOCAL.getText());
        senha.setLocal(criptografia.GetSenhaCript());
        //Usuario
        criptografia = new Criptografa(jTUSUARIO.getText());
        senha.setUsuario(criptografia.GetSenhaCript());
        //Senha
        criptografia = new Criptografa(String.valueOf(jPNOVASENHA.getPassword()));
        senha.setSenha(criptografia.GetSenhaCript());       
        //Datas
        String data;
        Calendar datas = Calendar.getInstance();
        data = String.valueOf(datas.getTime());        
        criptografia = new Criptografa(data);
       // senha.setDataCriac(criptografia.GetSenhaCript());
        senha.setDataModif(criptografia.GetSenhaCript());        
        senha.setConfiSenha(String.valueOf(jPCONFISENHA.getPassword()));
        senha.setNota(jTNOTA.getText());
    }
    
    //ATUALIZAR SENHAS
    private void Atualizar(){
         if (comparaSenha()){
            if (JOptionPane.showConfirmDialog(rootPane,"ATUALIZAR INFORMAÇÕES")==JOptionPane.OK_OPTION){            
                JTParaClass();
                AtualizarArqui atualizarArqui;
                //imprimir local
                atualizarArqui = new AtualizarArqui(getRecebLinha(),"Local", senha.getLocal());  
                atualizarArqui.AtualizaArquivo();
                //imprimir usuario
                atualizarArqui = new AtualizarArqui(getRecebLinha(),"Usuario", senha.getUsuario());
                atualizarArqui.AtualizaArquivo();
                //imprimir senha
                atualizarArqui = new AtualizarArqui(getRecebLinha(),"Senha", senha.getSenha());
                atualizarArqui.AtualizaArquivo();                
                //imprimir Data Modificação
                atualizarArqui = new AtualizarArqui(getRecebLinha(),"DataModif", senha.getDataModif());  
                atualizarArqui.AtualizaArquivo();   
                //Finaliza
                Finaliza();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "SENHA NÃO CONFERE, FAVOR DIGITAR NOVA SENHA");
            jPNOVASENHA.setText("");
            jPCONFISENHA.setText("");        
         }            
    }
    //DELETAR SENHAS
    public void Deletar(){         
        if (JOptionPane.showConfirmDialog(rootPane,"EXCLUIR INFORMAÇÕES")==JOptionPane.OK_OPTION){              
            AtualizarArqui at;
            at = new AtualizarArqui(getRecebLinha(), "Local", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(getRecebLinha(), "Usuario", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(getRecebLinha(), "Senha", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(getRecebLinha(), "DataCriac", "");        
            at.DeletaArquivo();  
            at = new AtualizarArqui(getRecebLinha(), "DataModif", "");        
            at.DeletaArquivo(); 
            //Finaliza
            Finaliza();
        }
    }
    
    //FECHA JFRAME E INICIA JFRAME PRINCIPAL
    private void Finaliza(){  
        this.dispose();
        ListaSenha listasenha = new ListaSenha();
        //listasenha.InicaTabel();
        listasenha.show();           
    }

    public int getRecebLinha() {
        return RecebLinha;
    }

    public void setRecebLinha(int RecebLinha) {
        this.RecebLinha = RecebLinha;
    }        
    
    
}
