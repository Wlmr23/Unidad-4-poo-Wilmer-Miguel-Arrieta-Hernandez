/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Main {
    public static void main(String[] args) {
        Persona persona = new Estudiante();
        persona.presentarse();
        persona.estudiar(); // Error de compilación: el método no está definido en Persona
    }
}
