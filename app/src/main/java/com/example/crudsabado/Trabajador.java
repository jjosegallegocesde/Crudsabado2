package com.example.crudsabado;

public class Trabajador {

    String nombre,cedula,cargo;

    public Trabajador(String nombre, String cedula, String cargo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}

