/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class moverse {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bici = new Bicicleta(); // polimorfismo

        vehiculo.moverse(); // Vehículo normal
        bici.moverse();     // Bicicleta sobrescribe el comportamiento
    }
}