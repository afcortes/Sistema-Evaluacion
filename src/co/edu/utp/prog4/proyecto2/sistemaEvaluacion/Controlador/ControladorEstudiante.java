/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Controlador;

import co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo.Examen;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

/**
 *
 * @author ANDRES
 */
public class ControladorEstudiante {
    private Examen examen;
    private Path archivo;
    private Formatter archivoRespuestas;
    
    public ControladorEstudiante(String nombre) throws FileNotFoundException{
        String ruta = nombre + ".txt";
        String ruta2 = nombre + "Solucionado.txt";
        if(Files.exists(Paths.get(ruta))){
            if(!Files.exists(Paths.get(ruta2))){
                archivoRespuestas = new Formatter(ruta2);
                
            }
        }
    }
}
