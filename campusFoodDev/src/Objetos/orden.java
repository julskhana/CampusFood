/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;

/**
 *
 * @author julian
 */
public class orden implements Serializable{
    
    private int id;
    private int numero;
    private String fecha;
    private String menu;
    private String descripcion;
    
    //cosntructor orden
    public orden (int id, int num, String fecha, String menu, String desc){
        this.id=id;
        this.numero=num;
        this.fecha=fecha;
        this.menu=menu;
        this.descripcion=desc;
    }
    
    //constructo vacio
    public orden(){}
    
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //getters

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMenu() {
        return menu;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
