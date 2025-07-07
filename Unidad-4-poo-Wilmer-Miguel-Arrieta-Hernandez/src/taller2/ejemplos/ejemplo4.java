/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo4 {
    
public class Persona {
private String nombre;


public static void mostrarNombre() {
System.out.println(this.nombre); // Error de compilación: No se puede usar `this` en un contexto estático
}
}

}
