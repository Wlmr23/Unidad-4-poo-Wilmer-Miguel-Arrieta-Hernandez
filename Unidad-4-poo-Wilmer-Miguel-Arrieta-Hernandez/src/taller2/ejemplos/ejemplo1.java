/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2.ejemplos;


/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo1 {

public class Persona {
private String nombre;


public Persona(String nombre) {
this.nombre = nombre; // Usamos `this` para referirnos al atributo de la clase
}


public void mostrarNombre() {
System.out.println("Nombre: " + this.nombre); // Usamos `this` para referirnos al atributo
}
}
}