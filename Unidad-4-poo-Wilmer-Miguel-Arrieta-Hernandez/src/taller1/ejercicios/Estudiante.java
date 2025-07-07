/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "No asignado";
    }

    // Constructor con 2 parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Pendiente";
    }

    // Constructor con 3 parámetros que llama al anterior
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " | Edad: " + edad + " | Curso: " + curso;
    }
}

