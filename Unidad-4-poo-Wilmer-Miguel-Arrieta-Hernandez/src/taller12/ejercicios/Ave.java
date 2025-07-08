/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */

public interface Volador {
    void volar();
}

public interface Cantante {
    void cantar();
}
public class Ave implements Volador, Cantante {

    @Override
    public void volar() {
        System.out.println("El ave está volando alto en el cielo.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave está cantando alegremente.");
    }
}