package com.example.julian.proyecto_android_app;

/**
 * Created by julian on 8/14/17.
 */

public class Restaurante {
    private int id;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private int capacidad;
    private String horario;
    private int puntuacion;
    //private String almuerzo;

    //constructor normal
    public Restaurante(int id, String nombre, String ubicacion, String descripcion, int capacidad, String hora, int puntos){
        this.id=id;
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.descripcion=descripcion;
        this.capacidad=capacidad;
        this.horario=hora;
        this.puntuacion=puntos;
    }

    //constructor ingresar
    public Restaurante(String nombre, String ubicacion, String descripcion, int capacidad, String hora, int puntos){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.descripcion=descripcion;
        this.capacidad=capacidad;
        this.horario=hora;
        this.puntuacion=puntos;
    }

    //constructor para consultar

    //constructor vacio
    public Restaurante(){}

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
