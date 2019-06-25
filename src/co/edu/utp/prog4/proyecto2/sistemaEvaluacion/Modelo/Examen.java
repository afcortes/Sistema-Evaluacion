/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author ANDRES
 */
public class Examen {
    private String descripcion;
    private float valor;
    private List<Pregunta> preguntas;
    private float resultado;

    public Examen(String descripcion, float valor) {
        this.descripcion = descripcion;
        this.preguntas = new ArrayList<>();
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Pregunta getPregunta(int numero) {
        return this.preguntas.get(numero);
    }
    
    public float getResultado() {
        return resultado;
    }
    
    public void agregarPregunta(String descripcion, List<String> respuestas, List<String> solucion, boolean abierta){
        Pregunta pregunta = new Pregunta(descripcion,respuestas,solucion,abierta);
        this.preguntas.add(pregunta);
    }
    
    public void validarRespuesta(int numero, List<String> solucion){     
        this.resultado += valor*this.preguntas.get(numero).validarRespuesta(solucion);
    }
}
