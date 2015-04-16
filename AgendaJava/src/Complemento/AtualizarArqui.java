/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class AtualizarArqui {
    
    private int linha;
    private String arquivo;
    private String palavra;
    private FileOutputStream os;
    
    public List<String> minhalista;    
    
    public AtualizarArqui(int RecebLinha, String ArquiParaAtual, String Atual){
        linha = RecebLinha;// indice da linha
        arquivo = ArquiParaAtual;
        palavra = Atual;    
        LerArquivo();
    }
   //ATUALIZA ARQUIVO
    public void AtualizaArquivo(){         
        minhalista.set(linha, palavra);       
        ExisteArquivo();
        Escreve(arquivo, minhalista);        
    }
    //ATUALIZA ARQUIVO
    public void DeletaArquivo(){        
        minhalista.remove(linha);
        ExisteArquivo();
        Escreve(arquivo, minhalista);       
    }    
    //LE ARQUIVO E SALVA EM UMA LISTA
    public void LerArquivo(){        
        //Lista arquivo
        LerArquivo ler;
        minhalista = new ArrayList<String>();        
        ler = new LerArquivo(arquivo);
        for(int x =0; x < ler.linha().size(); x++){
            minhalista.add(x, ler.linha().get(x));
        }                        
    }        
    
    //verifica existencia do arquivo
     private void ExisteArquivo(){
        try {
            os = new FileOutputStream(arquivo+".agd");
        } catch (FileNotFoundException ex) {
            try {
                os = new FileOutputStream(arquivo+".agd");
            } catch (FileNotFoundException ex1) {                
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex1);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO CLASS ATUALIZAR: "+ex1);
            }
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO CLASS ATUALIZAR: "+ex);
        }    
    }
    //REESCREVE O ARQUIVO 
    private void Escreve(String esteArquivo, List<String>Lista){           
        try {            
            os = new FileOutputStream(esteArquivo+".agd");                               
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);             
            
            for(int x =0; x < Lista.size(); x++){
                try {                
                    bw.write(Lista.get(x));                
                } catch (IOException ex) {                
                    Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO CLASS ATUALIZAR: "+ex);
                }            
                try {
                    bw.newLine();                
                } catch (IOException ex) {
                    Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO CLASS ATUALIZAR: "+ex);
                }
            }
            
            try {
                bw.close();           
            } catch (IOException ex) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO CLASS ATUALIZAR: "+ex);
            }
            try {
                osw.close();
            } catch (IOException ex) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO CLASS ATUALIZAR: "+ex);
            }
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO CLASS ATUALIZAR: "+ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }        
}
