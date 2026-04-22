/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Principal {
    
     public static void main(String[] args) {

        Stack<Tarea> pila = new Stack<>();
        Scanner leer = new Scanner(System.in);

        int opcion = 0;

        while(opcion!=6) {
            System.out.println("\n  MENU ");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tarea actual");
            System.out.println("3. Atender tarea");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Ordenar por prioridad");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese nombre de la tarea: ");
                    String nombre = leer.nextLine();

                    System.out.print("Ingrese prioridad: ");
                    int prioridad = leer.nextInt();
                    leer.nextLine();

                    pila.push(new Tarea(nombre, prioridad));
                    System.out.println("Tarea agregada.");
                    break;

                case 2:
                    if (!pila.isEmpty()) {
                        System.out.println("Tarea actual:");
                        System.out.println(pila.peek());
                    } else {
                        System.out.println("La pila está vacia.");
                    }
                    break;

                case 3:
                    if (!pila.isEmpty()) {
                        System.out.println("Atendiendo:");
                        System.out.println(pila.pop());
                    } else {
                        System.out.println("No hay tareas.");
                    }
                    break;

                case 4:
                    if (!pila.isEmpty()) {
                        mostrarPila(pila);
                    } else {
                        System.out.println("La pila está vacia.");
                    }
                    break;

                case 5:
                    Collections.sort(pila, Comparator.comparingInt(Tarea::getPrioridad));
                    System.out.println("Pila ordenada por prioridad.");
                    break;

                case 6:
                    System.out.println("Programa Terminado");
                    break;

                default:
                    System.out.println("Opción invalida.");
            }

        } 

        leer.close();
    }

    public static void mostrarPila(Stack<Tarea> pila) {
        System.out.println("\n TAREAS EN PILA ");
        for (Tarea t : pila) {
            System.out.println("Nombre: " + t.getNombre() +
                               " | Prioridad: " + t.getPrioridad());
        }
    }
}
