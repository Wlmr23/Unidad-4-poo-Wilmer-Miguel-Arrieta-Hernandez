/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo1 {
    

// Clase base
public class Animal {
public void hacerSonido() {
System.out.println("El animal hace un sonido.");
}
}


// Clase derivada
public class Perro extends Animal {
@Override
public void hacerSonido() {
System.out.println("El perro ladra.");
        }
    }
}
