/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo;

import java.util.List;

/**
 *
 * @author ANDRES
 */
public class PreguntaOpcionMultipleUnicaRespuesta extends Pregunta{
    
    private List <String> opciones;
    private boolean[] solucion;
    
    public PreguntaOpcionMultipleUnicaRespuesta(String enunciado, float valor) {
        super(enunciado, valor);
    }

    public PreguntaOpcionMultipleUnicaRespuesta(List<String> opciones, boolean[] solucion, String enunciado, float valor) {
        this(enunciado, valor);
        this.opciones = opciones;
        this.solucion = solucion;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public boolean[] getSolucion() {
        return solucion;
    }
    
    
    
    
}
