/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejercicio4 {
    // Clase base
public class Animal {
private String especie;


public Animal(String especie) {
this.especie = especie;
}
}


// Clase derivada (incorrecta)
public class Perro extends Animal {
public Perro(String raza) {
// No se llama al constructor de la clase base
System.out.println("Raza: " + raza);

}
}
}
