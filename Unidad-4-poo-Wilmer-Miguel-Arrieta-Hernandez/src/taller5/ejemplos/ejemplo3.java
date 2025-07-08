/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo3 {
    // Paquete: paqueteA
package paqueteA;


class Vehiculo {
String marca;


Vehiculo(String marca) {
this.marca = marca;
}
}


// Paquete: paqueteB
package paqueteB;


import paqueteA.Vehiculo;


public class Main {
public static void main(String[] args) {
Vehiculo v = new Vehiculo("Toyota"); // Error de compilación: Vehiculo no es visible

}
