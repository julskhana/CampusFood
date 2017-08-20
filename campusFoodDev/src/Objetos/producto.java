/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author julian
 */
public class producto implements Serializable{
    
    private int id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private float precio;
    private Date calendario;
    private int id_restaurante;
    
    //constructor
    public producto(int id, String nom, String desc, String tipo, float precio, Date cal, int id_rest){
        this.id=id;
        this.nombre=nom;
        this.tipo=tipo;
        this.descripcion=desc;
        this.precio=precio;
        this.calendario=cal;
        this.id_restaurante=id_rest;
    }
    
    //constructor para ingresar productos en orden
    public producto(int id, String nom,float precio){
        this.id=id;
        this.nombre=nom;
        this.precio=precio;
    }
    
    //constructor para ingresar
    public producto(String nom, String desc, String tipo, float precio, Date cal, int id_r){
        this.nombre=nom;
        this.tipo=tipo;
        this.descripcion=desc;
        this.precio=precio;
        this.calendario=cal;
        this.id_restaurante=id_r;
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

    public void setCalendario(Date calendario) {
        this.calendario = calendario;
    }

    public void setId_restaurante(int id_restaurante) {
        this.id_restaurante = id_restaurante;
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

    public Date getCalendario() {
        return calendario;
    }

    public int getId_restaurante() {
        return id_restaurante;
    }
    
}
