/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Administrador
 */
public class Senha {
    private String local;
    private String usuario;
    private String senha;
    private String dataCriac;
    private String dataModif;  
    private String confiSenha;
    private String nota;
    
    
    private int id;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCriac() {
        return dataCriac;
    }

    public void setDataCriac(String dataCriac) {
        this.dataCriac = dataCriac;
    }

    public String getDataModif() {
        return dataModif;
    }

    public void setDataModif(String dataModif) {
        this.dataModif = dataModif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConfiSenha() {
        return confiSenha;
    }

    public void setConfiSenha(String confiSenha) {
        this.confiSenha = confiSenha;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
