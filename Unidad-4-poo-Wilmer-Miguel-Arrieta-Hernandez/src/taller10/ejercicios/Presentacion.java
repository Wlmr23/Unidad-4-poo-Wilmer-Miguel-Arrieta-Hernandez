/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Presentacion {
      public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); // polimorfismo
        Persona profesor = new Profesor();     // polimorfismo

        persona.presentarse();
        estudiante.presentarse(); // Llama al de Estudiante
        profesor.presentarse();   // Llama al de Profesor
    }
}

