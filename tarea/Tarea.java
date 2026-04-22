/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

/**
 *
 * @author HP
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
   
    private String nombre; 
    private int prioridad; 

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", prioridad=" + prioridad + '}';
    }
    
    
    
}
