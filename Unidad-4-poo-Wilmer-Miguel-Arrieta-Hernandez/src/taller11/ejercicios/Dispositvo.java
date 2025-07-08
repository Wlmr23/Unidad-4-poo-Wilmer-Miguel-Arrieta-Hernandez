/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public abstract class Dispositivo {
    public abstract void encender();

    public void descripcion() {
        System.out.println("Soy un dispositivo.");
    }
}

public class Televisor extends Dispositivo {
    // No implementa encender()
}
