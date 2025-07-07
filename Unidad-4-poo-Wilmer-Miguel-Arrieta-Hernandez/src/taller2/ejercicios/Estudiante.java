/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Estudiante {
      private String nombre;
    private int edad;

    // Constructor por defecto que llama al constructor con parámetros
    public Estudiante() {
        this("Sin nombre", 0);
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
