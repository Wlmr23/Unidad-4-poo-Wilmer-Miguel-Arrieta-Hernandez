/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaVehiculo {
    public static void main(String[] args) {
        Moto m = new Moto("Motocicleta", "Yamaha", 150);
        m.mostrarInfo();
        
    System.out.println(m.tipo);   // Error si está en otro paquete
    System.out.println(m.marca);  // Error si está fuera del paquete
    }
}