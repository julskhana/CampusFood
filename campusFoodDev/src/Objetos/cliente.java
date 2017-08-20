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
    private String direccion;
    private String telefono;
    private char tipo;
    private float saldo;
    private float descuento;
    private int edad;
    private char sexo;
    private int id_usuario;
    
    //constructor 
    public cliente (int id, String ced, String noms, String apls, String correo, String dir, String tel, char tipo, float saldo, float desc, int edad, char sexo, int id_u){
        this.id=id;
        this.cedula=ced;
        this.nombres=noms;
        this.apellidos=apls;
        this.correo=correo;
        this.direccion=dir;
        this.telefono=tel;
        this.tipo=tipo;
        this.saldo=saldo;
        this.descuento=desc;
        this.edad=edad;
        this.sexo=sexo;
        this.id_usuario=id_u;
    }
    
    //constructor para ingresar
    public cliente (String ced, String noms, String apls, String correo, String dir, String tel, char tipo, float saldo, float desc, int edad, char sexo, int id_u){
        this.cedula=ced;
        this.nombres=noms;
        this.apellidos=apls;
        this.correo=correo;
        this.direccion=dir;
        this.telefono=tel;
        this.tipo=tipo;
        this.saldo=saldo;
        this.descuento=desc;
        this.edad=edad;
        this.sexo=sexo;
        this.id_usuario=id_u;
    }
    
    //constructor para ingresar en orden
    public cliente (int id, String ced, String noms, String apls, String correo, char tipo, float saldo){
        this.id=id;
        this.cedula=ced;
        this.nombres=noms;
        this.apellidos=apls;
        this.correo=correo;
        this.tipo=tipo;
        this.saldo=saldo;
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

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public char getTipo() {
        return tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getDescuento() {
        return descuento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    
    
    
}
