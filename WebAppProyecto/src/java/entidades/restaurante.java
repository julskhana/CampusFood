    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author julian
 */
public class restaurante implements Serializable{
    
    private int id;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private int capacidad;
    private String horario;
    private int puntuacion;
    //private String almuerzo;
    
    //constructor normal
    public restaurante(int id, String nombre, String ubicacion, String descripcion, int capacidad, String hora, int puntos){
        this.id=id;
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.descripcion=descripcion;
        this.capacidad=capacidad;
        this.horario=hora;
        this.puntuacion=puntos;
    }
    
    //constructor ingresar
    public restaurante(String nombre, String ubicacion, String descripcion, int capacidad, String hora, int puntos){    
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.descripcion=descripcion;
        this.capacidad=capacidad;
        this.horario=hora;
        this.puntuacion=puntos;
    }
    
    //constructor para consultar
    
    //constructor vacio
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

    public String getDescripcion() {
        return descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getHorario() {
        return horario;
    }

    public int getPuntuacion() {
        return puntuacion;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
}
