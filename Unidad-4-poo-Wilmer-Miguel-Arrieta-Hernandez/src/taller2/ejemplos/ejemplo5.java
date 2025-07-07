/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo5 {
    

public class Persona {
private String nombre;


public void setNombre(String nombre) {
this.nombre = nombre; // Aquí `this` es necesario


// Uso innecesario de `this` dentro de un método sin ambigüedad
this.mostrarNombre(); // Aunque compila, `this` aquí es innecesario
}


public void mostrarNombre() {
System.out.println("Nombre: " + nombre); // `this` no es necesario aquí
}

}

}
