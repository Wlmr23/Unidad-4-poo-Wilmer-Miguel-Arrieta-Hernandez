/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class taller8ejercicio3 {
    class A {
    void metodoA() {
        System.out.println("Clase A");
    }
}

class B {
    void metodoB() {
        System.out.println("Clase B");
    }
}
class Base {
    private String dato = "Secreto";
}

class Derivada extends Base {
    public void mostrarDato() {
       System.out.println(dato); // ERROR: 'dato' es privado
    }
}
}
