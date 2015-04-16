/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class LerArquivo {
    protected String Arquivo;
    protected InputStream is;
    
    public LerArquivo(String RecebeArquivo){
        Arquivo = RecebeArquivo + ".agd";        
    }
    // VERIFICA SE ARQUIVO EXISTE, CASO NOTFOUND ABRE CAIXA DE MENSAGEM E NÃO CARREGA LINHA
    public  boolean ExisteArquivo(){
        boolean retorna = true;
        try {        
            is = new FileInputStream(Arquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LerArquivo.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "ERRO - LINHA 37 ");            
            retorna = false;           
        }
        return retorna;
    }
    //LISTA LINHAS DO TEXTO
    public List<String> linha(){
            List<String> minhalista = new ArrayList<String>();        
            if(ExisteArquivo()){
                try {
                    InputStreamReader isr = new InputStreamReader(is);            
                    BufferedReader br = new BufferedReader(isr);            
                    String s;           
                    s = br.readLine();                                              
                    while(s != null) {                
                        try {
                            minhalista.add(s);        
                            s = br.readLine();
                        } catch (IOException ex) {
                            Logger.getLogger(LerArquivo.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, "LerArquivo() - ERRO LINHA: 58 " + ex);            
                        }
                    }
                    br.close();
                    isr.close();
                    is.close();
                } catch (IOException ex) {
                    Logger.getLogger(LerArquivo.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "LerArquivo() - ERRO LINHA: 50 " + ex);            
                }
            }            
        return minhalista;    
    }
    
    public void testa() throws FileNotFoundException, IOException{
        List<String> minhalista = linha();
        for(int x = 0; x < minhalista.size(); x++) {
            System.out.println(minhalista.get(x));
        }        
    }
}
