/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo;

import java.util.Collections;
import java.util.List;


/**
 *
 * @author ANDRES
 */
public class Pregunta {
    private String enunciado;
    private float valor;
    
    public Pregunta(String enunciado, float valor){
        this.enunciado = enunciado;
        this.valor = valor;
    }
    
    
    public float getValor(){
        return valor;
    }

    public String getEnunciado() {
        return enunciado;
    }
    
}
