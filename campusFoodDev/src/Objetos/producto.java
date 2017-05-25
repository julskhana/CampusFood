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
public class producto implements Serializable{
    
    private int id;
    private String nombre;
    private String tipo;
    private String descripcion;
    private float precio;
    private String calendario;
    
    //constructor
    public producto(int id, String nom, String tipo, String desc, float precio, String cal){
        this.id=id;
        this.nombre=nom;
        this.tipo=tipo;
        this.descripcion=desc;
        this.precio=precio;
        this.calendario=cal;
    }
    
    //constructor vacio
    public producto(){}
    
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }
    
    //getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCalendario() {
        return calendario;
    }
    
}
