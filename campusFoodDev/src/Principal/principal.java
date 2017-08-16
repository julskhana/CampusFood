/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Formularios.*;

/**
 * @author julian
 */
public class principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sistema de gestion de almuerzos - Campus Espol\n");
        
        //codigo para iniciar proyecto con autenticacion
        frmAutenticacion aut = new frmAutenticacion();
        aut.setVisible(true);
        
        //codigo para iniciar proyecto sin autenticacion
        //String usuario1 = "jabajana";
        //frmPrincipal frmP = new frmPrincipal(usuario1);
        //frmP.setVisible(true);
    }
}
