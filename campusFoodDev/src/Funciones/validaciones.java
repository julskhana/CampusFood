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
    
    public static boolean esNumerico(String num){
        for (char c : num.toCharArray()){
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    
    public static boolean esAlfabetico(String str){
        for (char c : str.toCharArray()){
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
