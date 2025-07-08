/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaArea {
        public static void main(String[] args) {
        Figura Rectangulo = new Rectangulo(4, 5);
        Figura Triangulo = new Triangulo(6, 3);

        System.out.println("Área del rectángulo: " + Rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + Triangulo.calcularArea());
    }
}
