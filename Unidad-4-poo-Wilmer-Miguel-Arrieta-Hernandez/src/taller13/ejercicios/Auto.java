/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
 public interface Movible {
    void mover();
    }
    public class Auto implements Movible {
    }
// metodos mal entendidos
public abstract class Dispositivo {
    // Esto es incorrecto: método abstracto con cuerpo
    public abstract void encender() {
        System.out.println("Encendiendo dispositivo.");
    }
}
