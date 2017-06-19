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
public class usuario implements Serializable{
    
    private int id;
    private String clave;
    private String rol;
    private String estado;
    private String fecha_registro;
    
    //Constructor
    public usuario (int id, String clave, String rol, String estado, String fecha_reg){
        this.id=id;
        this.clave=clave;
        this.rol=rol;
        this.estado=estado;
        this.fecha_registro=fecha_reg;
    }
    
    //Constructor para ingresar
    public usuario (String clave, String rol, String estado, String fecha_reg){
        this.clave=clave;
        this.rol=rol;
        this.estado=estado;
        this.fecha_registro=fecha_reg;
    }
    
    //cosntructor de consulta
    public usuario (int id, String rol, String estado, String fecha_reg){
        this.id=id;
        this.rol=rol;
        this.estado=estado;
        this.fecha_registro=fecha_reg;
    }
    
    //cosntructor vacio
    public usuario(){}

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getClave() {
        return clave;
    }

    public String getRol() {
        return rol;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }
    
}
