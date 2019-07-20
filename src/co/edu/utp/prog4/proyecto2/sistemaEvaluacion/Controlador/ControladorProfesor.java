/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Controlador;

import co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo.Examen;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.List;

/**
 *
 * @author ANDRES
 */
public class ControladorProfesor {
    private Examen examen; 
    
    public ControladorProfesor(){
    }
    
    public ControladorProfesor(Examen examen){
        this.examen = examen;
    }
    
    public Examen getExamen(){
        return examen;
    }
    
    public void setExamen(Examen examen){
        this.examen = examen;
    }
}
