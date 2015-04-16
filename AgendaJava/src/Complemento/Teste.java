/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;


import Criptografia.Descriptografa;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Teste {
    
    
   // public DefaultTableModel executar(){
            //lerLocal.
        /*int y = lerLocal.linha().size() -1;
        String palavra[] = new String[y];        
        for(int x = 0; x < lerLocal.linha().size(); x++){
        palavra[x] = lerLocal.linha().get(x);        
        }
        Model.addRow(palavra); 
        */
        //Model.addRow(Coluna);
        //return Model;
        
    //}
    /*public DefaultTableModel TTabela(){        
        String [] Coluna =  {"Local","Usuario","Senha","Data Criação", "Data Modificação"} ;
        DefaultTableModel Model = new DefaultTableModel(Coluna,0); 
        JTable jTabela = new JTable(Model);        
        
        jTabela.setModel(Model);
        LerArquivo lerArqui;
        lerArqui = new LerArquivo("Local");
        if(lerArqui.ExisteArquivo()){
            
        }
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
        
        
    }
        return Model;
}
    public void IniciaTXT(){
        LerArquivo lerLocal = new LerArquivo("Local");
        LerArquivo lerUsuario = new LerArquivo("Usuario");
        LerArquivo lerSenha = new LerArquivo("Senha");
        LerArquivo lerDataCriac = new LerArquivo("DataCriac");
        LerArquivo lerDataModif = new LerArquivo("DataModif");    
        Imprimir imprimir;
        Descriptografa descriptografa;
        String Stglinha = null;
        for(int x = 0; x < lerLocal.linha().size(); x++){
            descriptografa = new Descriptografa(lerLocal.linha().get(x));
            Stglinha = descriptografa.getSenhaDescr() + "     ";
            descriptografa = new Descriptografa(lerUsuario.linha().get(x));
            Stglinha = Stglinha + descriptografa.getSenhaDescr() + "     ";
            descriptografa = new Descriptografa(lerSenha.linha().get(x));
            Stglinha = Stglinha + descriptografa.getSenhaDescr()+ "     ";            
            descriptografa = new Descriptografa(lerDataCriac.linha().get(x));
            Stglinha = Stglinha + descriptografa.getSenhaDescr()+ "     ";            
            descriptografa = new Descriptografa(lerDataModif.linha().get(x));
            Stglinha = Stglinha + descriptografa.getSenhaDescr()+ "     ";           
            
            imprimir = new Imprimir("Testa", Stglinha);
            //Runtime.getRuntime().e
        }
        
    }*/
}
