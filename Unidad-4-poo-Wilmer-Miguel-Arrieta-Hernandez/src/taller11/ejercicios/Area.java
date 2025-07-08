/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Area {
  public class PruebaFigura {
    public static void main(String[] args) {
        Figura f1 = new Circulo(3.0);
        Figura f2 = new Rectangulo(4.0, 5.0);

        f1.mostrarArea(); // Área del círculo
        f2.mostrarArea(); // Área del rectángulo
     }
    }  
}
