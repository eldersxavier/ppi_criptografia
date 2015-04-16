/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Imprimir {
    private String arquivo;
    private String palavra;    
    private FileOutputStream os;
    
    //RECEBE VARIAVEIS E EXECUTA METODOS
    public Imprimir(String RecArquivo, String RecebePalavra){
        arquivo = RecArquivo +".agd";    
        palavra = RecebePalavra;
        ExisteArquivo();
        Escreve();        
    }    
    // VERIFICA SE ARQUIVO EXISTE EM DIRETORIO OU CRIA ARQUIVO  
    private void ExisteArquivo(){
        try {
            os = new FileOutputStream(arquivo, true);
        } catch (FileNotFoundException ex) {
            try {
                os = new FileOutputStream(arquivo);
            } catch (FileNotFoundException ex1) {                
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex1);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO LINHA 42: "+ex1);
            }
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO LINHA 40: "+ex);
        }    
    }
    //IMPRIME STRING PALAVRA NO ARQUIVO 
    private void Escreve(){           
        try {            
            os = new FileOutputStream(arquivo, true);                               
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);             
            try {
                bw.write(palavra);
            } catch (IOException ex) {                
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO LINHA 58: "+ex);
            }            
            try {
                bw.newLine();                
            } catch (IOException ex) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO LINHA 64: "+ex);
            }
            try {
                bw.close();           
            } catch (IOException ex) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO LINHA 70: "+ex);
            }
            try {
                osw.close();
            } catch (IOException ex) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO LINHA 78: "+ex);
            }
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "IMPRIMIMIR - ERRO LINHA 81: "+ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }    
    
    //teste impressao
    public void testa() throws FileNotFoundException, IOException{
            InputStream is;
            is = new FileInputStream(arquivo);        
            InputStreamReader isr = new InputStreamReader(is);            
            BufferedReader br = new BufferedReader(isr);            
            String s = br.readLine(); // primeira linha
            while ( s != null) {                
                System.out.println(s);            
                s = br.readLine();        
            }
             br.close();  
             isr.close();
             is.close();
    }
    
}
