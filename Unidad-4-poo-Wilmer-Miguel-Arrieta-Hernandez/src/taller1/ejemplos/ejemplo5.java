/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo5 {
    public class Coche  {
     String marca;
     String modelo;

// Constructor con un parámetro
public Coche(String marca) {
this.marca = marca;
}
// Llamada al constructor anterior usando `this()`
public Coche(String marca, String modelo) {
this(marca); // Llama al constructor de un solo parámetro
this.modelo = modelo;
        }
    }

}
