/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaUtilidades {
  public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.sumar(10, 5));
        System.out.println("Resta: " + Utilidades.restar(10, 5));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(10, 5));
        System.out.println("División: " + Utilidades.dividir(10, 2));
        System.out.println("División por cero: " + Utilidades.dividir(10, 0)); // Verifica protección
    }
}
