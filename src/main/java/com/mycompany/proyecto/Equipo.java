/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import java.util.ArrayList;


/**
 *
 * @author carlos
 */
public class Equipo {
    
    private int id;
    private String nombreEquipo;
    private String gerente;
    private ArrayList<Usuario> miembros = new ArrayList<>();
    private ArrayList<Proyectos> proyectos = new ArrayList<>();

    
    
    public void asignarMiembro (Usuario u){
        u.setNombreEquipo(this.getNombreEquipo());
        miembros.add(u);
    }

    public void asignarProyecto (Proyectos p){
        p.setNombreEquipo(this.getNombreEquipo());
        proyectos.add(p);
    }
    
    /*
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * @param nombreEquipo the nombreEquipo to set
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * @return the gerente
     */
    public String getGerente() {
        return gerente;
    }

    /**
     * @param gerente the gerente to set
     */
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    /**
     * @return the miembros
     */
    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    /**
     * @param miembros the miembros to set
     */
    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    /**
     * @return the proyectos
     */
    public ArrayList<Proyectos> getProyectos() {
        return proyectos;
    }

    /**
     * @param proyectos the proyectos to set
     */
    public void setProyectos(ArrayList<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }


    
    
}
