/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo6 {
    public class Vehiculo {
String tipo;


public Vehiculo(String tipo) {
    this.tipo = tipo;
    }
}
public class Coche extends Vehiculo {
String marca;
// Llama al constructor de la clase base usando `super()`
public Coche(String tipo, String marca) {
super(tipo);
this.marca = marca;
     }
   }
}

