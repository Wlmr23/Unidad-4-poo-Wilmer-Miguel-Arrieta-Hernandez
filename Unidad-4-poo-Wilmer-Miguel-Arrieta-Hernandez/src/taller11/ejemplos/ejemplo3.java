/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo3 {  


// Clase abstracta
public abstract class Vehiculo {
public abstract void conducir(); // Método abstracto
}


// Clase derivada incorrecta
public class Coche extends Vehiculo {
// Error de compilación: La clase Coche debe implementar el método abstracto conducir()
    }
}