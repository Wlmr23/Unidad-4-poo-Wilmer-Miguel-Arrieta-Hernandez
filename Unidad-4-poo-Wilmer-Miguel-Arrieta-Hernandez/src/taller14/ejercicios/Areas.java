/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Areas {
       public static void main(String[] args) {
        Figura f1 = new Circulo(3);
        Figura f2 = new Rectangulo(4, 5);

        f1.calcularArea(); // Polimorfismo: llama a método de Circulo
        f2.calcularArea(); // Polimorfismo: llama a método de Rectangulo
    }
}

