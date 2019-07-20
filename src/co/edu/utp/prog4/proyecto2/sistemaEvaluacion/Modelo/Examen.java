/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author ANDRES
 */
public class Examen implements Serializable{
    private String descripcion;
    private int valor;
    private List<Pregunta> preguntas;
    

    public Examen(String descripcion, int valor) {
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
    
    public int getValor(){
        return valor;
    }
    
    public void agregarPregunta(Pregunta pPregunta){
        preguntas.add(pPregunta);
    }
    
    public int getNumeroPreguntas(){
        return preguntas.size();
    }
}
