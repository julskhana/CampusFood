/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author julian
 */
public class validaciones {
    
    public static boolean esNumerico(String s){
        for (char c : s.toCharArray()){
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    
    public static boolean esCedulaValida(String ced){
        return !(ced.length()!=10 && esNumerico(ced));
    }
}
