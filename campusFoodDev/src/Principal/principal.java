/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Formularios.frmAutenticacion;
import Formularios.frmPrincipal;

/**
 *
 * @author julian
 */
public class principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sistema de gestion de almuerzos - Campus Espol\n");
        
        
        frmAutenticacion aut = new frmAutenticacion();
        aut.setVisible(true);
        
        /*
        frmPrincipal frmP = new frmPrincipal();
        frmP.setVisible(true);
        */
    }
}
