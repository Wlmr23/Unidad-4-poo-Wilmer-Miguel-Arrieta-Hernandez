/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public abstract class Animal {
    public abstract void sonido();
}

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal a = new Animal(); // ERROR: no se puede instanciar clase abstracta
    }
}
