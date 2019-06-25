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
    private String descripcion;
    private float valor;
    private List<String> respuestas;
    private List<String> solucion;
    private boolean multipleSolucion;
    private boolean abierta;
    
    public Pregunta(String descripcion, List<String> respuestas, List<String> solucion, boolean abierta){
        this.descripcion = descripcion;
        this.respuestas = respuestas;
        this.solucion = solucion;
        this.abierta = abierta;
        this.multipleSolucion = solucion.size()>1;
    }
    
    public String getDescripcion(){
        return descripcion;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public List<String> getSolucion() {
        return solucion;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float validarRespuesta(List<String> solucion){
        if(this.abierta){
            return valor;
        }
        else if(this.multipleSolucion){
            Collections.sort(this.solucion);
            Collections.sort(solucion);
        }
        float puntaje = 0;
        float valorPorRespuesta = this.valor/this.solucion.size();
        for(String e: solucion){
            if(this.solucion.contains(e)){
                puntaje += valorPorRespuesta;
            }
        }
        return puntaje;
    }
    
}
