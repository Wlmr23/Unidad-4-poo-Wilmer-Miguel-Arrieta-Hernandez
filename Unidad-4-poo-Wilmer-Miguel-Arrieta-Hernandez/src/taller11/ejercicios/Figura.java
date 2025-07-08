/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public abstract class Figura {
    // Método abstracto
    public abstract double calcularArea();

    // Método concreto que usa el abstracto
    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}

