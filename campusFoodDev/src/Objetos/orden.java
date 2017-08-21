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
    private String descripcion;
    private float subtotal;
    private float iva_cero;
    private float iva;
    private float total;
    private int id_cliente;
    private int id_detalle_orden;

    //constructor completo
    public orden(int id, int numero, String fecha, String descripcion, float subtotal, float iva_cero, float iva, float total, int id_cliente, int id_detalle_orden) {
        this.id = id;
        this.numero = numero;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.subtotal = subtotal;
        this.iva_cero = iva_cero;
        this.iva = iva;
        this.total = total;
        this.id_cliente = id_cliente;
        this.id_detalle_orden = id_detalle_orden;
    }
        
    //constructor para ingresar
    public orden(int numero, String fecha, String descripcion, float subtotal, float iva_cero, float iva, float total, int id_cliente, int id_detalle_orden) {        
        this.numero = numero;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.subtotal = subtotal;
        this.iva_cero = iva_cero;
        this.iva = iva;
        this.total = total;
        this.id_cliente = id_cliente;
        this.id_detalle_orden = id_detalle_orden;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva_cero(float iva_cero) {
        this.iva_cero = iva_cero;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_detalle_orden(int id_detalle_orden) {
        this.id_detalle_orden = id_detalle_orden;
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

    public String getDescripcion() {
        return descripcion;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public float getIva_cero() {
        return iva_cero;
    }

    public float getIva() {
        return iva;
    }

    public float getTotal() {
        return total;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_detalle_orden() {
        return id_detalle_orden;
    }
    
}
