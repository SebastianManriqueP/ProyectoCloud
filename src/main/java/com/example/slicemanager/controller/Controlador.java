package com.example.slicemanager.controller;

import com.example.slicemanager.entities.Enlace;
import com.example.slicemanager.entities.Recurso;
import com.example.slicemanager.entities.Slice;
import com.example.slicemanager.entities.VM;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class Controlador {

    @GetMapping("/listar/detalle")
    Slice Slicedetalle(){
        /*Data Hardcodeada*/
        Recurso recurso1 = new Recurso("2 Core","2GB","10 GB");
        Recurso recurso2 = new Recurso("2Core","3GB","15GB");
        VM vm1 = new VM("Maquina 1",recurso1);
        VM vm2 = new VM("Maquina 2",recurso2);
        Enlace enlace = new Enlace("Maquina 1","Maquina 2");

        List<Enlace> enlaces= new ArrayList<>();
        List<VM> maquinas = new ArrayList<>();

        enlaces.add(enlace);
        maquinas.add(vm1);
        maquinas.add(vm2);

        Slice slice = new Slice("Slice 1",maquinas,enlaces);

        return slice;}
}
