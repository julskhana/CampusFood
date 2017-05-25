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
public class cliente implements Serializable{
    
    private int id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String tipo;
    private float saldo;
    private float descuento;
    
    //constructor 
    public cliente (int id, String ced, String noms, String apls, String correo, String tipo, float saldo, float desc){
        this.id=id;
        this.cedula=ced;
        this.nombres=noms;
        this.apellidos=apls;
        this.correo=correo;
        this.tipo=tipo;
        this.saldo=saldo;
        this.descuento=desc;
    }
    
    //constructor vacio
    public cliente(){}
    
    //setters
    
    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }    
    
    //getters

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipo() {
        return tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getDescuento() {
        return descuento;
    }
    
    
}
