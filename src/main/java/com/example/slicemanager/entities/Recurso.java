package com.example.slicemanager.entities;

public class Recurso {
    private String CoresCpu;
    private String Ram;
    private String Almacenamiento;

    public Recurso(String coresCpu, String ram, String almacenamiento) {
        CoresCpu = coresCpu;
        Ram = ram;
        Almacenamiento = almacenamiento;
    }

    public String getCoresCpu() {
        return CoresCpu;
    }

    public void setCoresCpu(String coresCpu) {
        CoresCpu = coresCpu;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        Almacenamiento = almacenamiento;
    }
}
