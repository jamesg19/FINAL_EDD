/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

/**
 * 
 * @author James Gramajo 
 */
public class Usuario {
    private String id;
    private String cargo;
    private String usuario;
    private String password;
    private String rol;

    public Usuario(String id, String cargo, String usuario, String password, String rol) {
        this.id = id;
        this.cargo = cargo;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }
    public Usuario(String id, String usuario, String password, String rol) {
        this.id = id;

        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    
    
    
    
    

}
