/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.Class;

/**
 *
 * @author ecarrizo
 */
public class LoginClass {

    private String Usuario;
    private String Password;

    public LoginClass() {
    }

    public LoginClass(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
