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
public class detalleOrden implements Serializable{
    int id;
    int cantidad;
    float precio_unitario;
    float precio_total;
    int id_prod;
    int id_orden;
    
    //constructor
    public detalleOrden (int id, int cant, float puni, float ptotal, int producto, int id_o){
        this.id=id;
        this.cantidad=cant;
        this.precio_unitario=puni;
        this.precio_total=ptotal;
        this.id_prod=producto;
        this.id_orden=id_o;
    }
    
    //constructor para ingresar
    public detalleOrden (int cant, float puni, float ptotal, int producto, int id_ord){
        this.cantidad=cant;
        this.precio_unitario=puni;
        this.precio_total=ptotal;
        this.id_prod=producto;
        this.id_orden=id_ord;
    }
    
    //constructor vacio
    public detalleOrden(){}
    
    //setters
    
    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }
    
    //getters

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public int getId_prod() {
        return id_prod;
    }

    public int getId_orden() {
        return id_orden;
    }

}
