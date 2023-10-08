package com.example.slicemanager.entities;

import java.util.List;

public class Slice {

    private  String nombre;
    private List<VM> maquinasVirtuales;
    private List<Enlace> enlaces;

    public Slice(String nombre, List<VM> maquinasVirtuales, List<Enlace> enlaces) {
        this.nombre = nombre;
        this.maquinasVirtuales = maquinasVirtuales;
        this.enlaces = enlaces;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VM> getMaquinasVirtuales() {
        return maquinasVirtuales;
    }

    public void setMaquinasVirtuales(List<VM> maquinasVirtuales) {
        this.maquinasVirtuales = maquinasVirtuales;
    }

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(List<Enlace> enlaces) {
        this.enlaces = enlaces;
    }
}
