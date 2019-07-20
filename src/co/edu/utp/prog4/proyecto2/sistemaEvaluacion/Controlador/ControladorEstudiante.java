/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Controlador;

import co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo.Examen;

/**
 *
 * @author ANDRES
 */
public class ControladorEstudiante {
    private Examen examen;
    private int pregunta;
    
    public ControladorEstudiante(Examen examen){
        this.examen = examen;
        this.pregunta = 0;
    }
    
    public Examen getExamen(){
        return examen;
    }
    
    public int getPregunta(){
        return pregunta;
    }
    
    public void avanzar(){
        pregunta++;
    }
    
    public void retroceder(){
        pregunta--;
    }
}
