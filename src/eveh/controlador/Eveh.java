/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eveh.controlador;

import eveh.View.LoginView;

/**
 * @author ecarrizo
 */
public class Eveh {

    LoginView miLoginView;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eveh miPrincipal = new Eveh();
        miPrincipal.iniciar();
    }

    private void iniciar() {
        miLoginView = new LoginView();
        miLoginView.setVisible(true);
    }
}
