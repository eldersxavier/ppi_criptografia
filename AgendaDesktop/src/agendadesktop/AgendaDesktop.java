/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadesktop;


import Complemento.LerArquivo;
import Criptografia.Criptografa;
import Criptografia.Descriptografa;
import Criptografia.TesteCrip;
import Formularios.ListaSenha;
import Formularios.Login;

/**
 *
 * @author Administrador
 */
public class AgendaDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //new Login().show();
        //int x=(int)'A';
        //System.out.println(x);
        //Criptografa cr = new Criptografa("abc");
        //TesteCrip cr = new TesteCrip("abc");
        //System.out.println(cr.GetSenhaCript());
        //Descriptografa d = new Descriptografa(cr.GetSenhaCript());
        //System.out.println(d.getSenhaDescr());
        new ListaSenha().setVisible(true);
       
    }
        
}
