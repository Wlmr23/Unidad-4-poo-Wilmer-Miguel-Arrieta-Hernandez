/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    // Constructor que incrementa el contador
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    // Método estático para mostrar cuántos coches se han creado
    public static void mostrarContador() {
        System.out.println("Coches creados: " + contadorCoches);
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo;
    }
}

