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
public class restaurante implements Serializable{
    
    private int id;
    private String nombre;
    private String ubicacion;
    private String almuerzo;
    
    public restaurante(int id, String nom, String ubi, String alm){
        this.id=id;
        this.nombre=nom;
        this.ubicacion=ubi;
        this.almuerzo=alm;
    }
    
    public restaurante(){}
    
    //getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }
    
}
