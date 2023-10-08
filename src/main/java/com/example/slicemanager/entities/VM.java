package com.example.slicemanager.entities;

public class VM {
    private String nombre;
    private Recurso recursos;

    public VM(String nombre, Recurso recursos) {
        this.nombre = nombre;
        this.recursos = recursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Recurso getRecursos() {
        return recursos;
    }

    public void setRecursos(Recurso recursos) {
        this.recursos = recursos;
    }
}
