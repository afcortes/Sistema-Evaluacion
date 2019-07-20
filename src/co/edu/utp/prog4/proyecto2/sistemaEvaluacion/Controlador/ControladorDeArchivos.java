/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Controlador;

import co.edu.utp.prog4.proyecto2.sistemaEvaluacion.Modelo.Examen;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES
 */
public class ControladorDeArchivos {
    private static ControladorDeArchivos instance;

    public ControladorDeArchivos() {
    }

    public static ControladorDeArchivos getInstance() {
        if (instance == null) {
            instance = new ControladorDeArchivos();
        }
        return instance;
    }
    
    public Examen leer(String direccion) throws FileNotFoundException, IOException, ClassNotFoundException{
        Examen examen = null;
        try(ObjectInputStream i = new ObjectInputStream(new FileInputStream(new File(direccion + ".cad")))){
            Object leido = i.readObject();
            if(leido != null && leido instanceof Examen){
                examen = (Examen) leido;
            }
        }       
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No fue posible abrir el archivo");
            JOptionPane.showMessageDialog(null, e);
        }
        return examen;
    }
    
    public void guardarCuestionario(String direccion, Examen examen){
        try (ObjectOutputStream i = new ObjectOutputStream(new FileOutputStream(direccion + ".cad"))) {
            i.writeObject(examen);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No fue posible guardar el examen");
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
