/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo4 {
    // Interfaz Volador
public interface Volador {
void volar();
} 

// Clase incorrecta que no implementa todos los métodos
public class Avion implements Volador {
// Error de compilación: La clase Avion debe implementar el método volar()
}

}
