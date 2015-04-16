/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendajava;

import Complemento.LerArquivo;
import Complemento.Teste;
import Criptografia.Descriptografa;
import Formularios.ListaSenha;
import Formularios.Login;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class AgendaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        new ListaSenha().show();
        //String [] Coluna =  {"Local","Usuario","Senha","Data Criação", "Data Modificação"} ;
        //System.out.println(Coluna.clone().toString());
        //Teste t = new Teste();
        //t.IniciaTXT();
        //Runtime.getRuntime().exec("notepad.exe");
        //File f = new File("E:/DataCriac.txt");
        //f.setReadable(true);
        //Runtime rum = new Runtime().get;
       // Runtime rum = null;
       // rum.load("E:/DataCriac.txt");
        //rum.getRuntime().exec("C:/WINDOWS/system32/notepad.exe");
        // rum.getRuntime().load("E:/DataCriac.txt");
        
        //Runtime.getRuntime().exec("E:/DataCriac.agd");
        //new Login().setVisible(true);
       // LerArquivo ler = new LerArquivo("Local");
        //Descriptografa des = new Descriptografa(ler.linha().get(2));
        //System.out.println(des.getSenhaDescr());
    }
}
