/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche();
        Vehiculo v2 = new Bicicleta();

        v1.mover(); // Polimorfismo: llama a Coche
        v2.mover(); // Polimorfismo: llama a Bicicleta
    }
}