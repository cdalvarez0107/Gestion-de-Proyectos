/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Proyecto {
    
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Equipo> equipos;
    public static ArrayList<Proyectos> proyectos;
    public static ArrayList<Tarea> tareas;


    public static void main(String[] args) {
        
        usuarios = new ArrayList<> ();
        equipos = new ArrayList<>();
        proyectos = new ArrayList<>();
        tareas = new ArrayList<>();

        
        Login log = new Login();
        
        log.setVisible(true);

    }
}
