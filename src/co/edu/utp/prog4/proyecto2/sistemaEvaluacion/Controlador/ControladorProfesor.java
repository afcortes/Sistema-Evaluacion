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
    private Formatter archivo;
    private Formatter archivoRespuestas;
    
    
    public ControladorProfesor(String nombre) throws FileNotFoundException{
        String ruta = nombre + ".txt";
        String ruta2 = nombre + "Respuestas.txt";
        if(!(Files.exists(Paths.get(ruta))||Files.exists(Paths.get(ruta2)))){
            this.archivo = new Formatter(ruta);
            this.archivoRespuestas = new Formatter(ruta2);
        }
        else{
            System.exit(1);
        }
    }
    
    public void crearExamen(String descripcion, float valor){
        this.examen = new Examen(descripcion,valor);
    }
    
    public void agregarPregunta(String descripcion, List<String> respuestas, List<String> solucion, boolean abierta){
        this.examen.agregarPregunta(descripcion, respuestas, solucion, abierta);
    }
    
    public void guardar(){
        
    }
}
