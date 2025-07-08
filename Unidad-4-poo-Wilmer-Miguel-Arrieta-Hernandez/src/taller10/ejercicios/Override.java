/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Override {
    public class Derivada extends Base {
    // Sin @Override — funciona, pero es mala práctica
    public void saludar(String nombre) {
        System.out.println("¡Saludos, " + nombre + "!");
        }
    }
}
