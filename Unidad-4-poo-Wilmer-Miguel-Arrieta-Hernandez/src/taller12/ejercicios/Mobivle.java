/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Mobivle {
    public interface Movible {
    void mover();
}
    public class ObjetoIncompleto implements Movible {
}

public interface Volador {
    void volar();
}

public class Piedra implements Volador {
    @Override
    public void volar() {
        // ❌ Lógica forzada: una piedra no vuela
        System.out.println("La piedra... ¡no puede volar!");
        }
    }
}