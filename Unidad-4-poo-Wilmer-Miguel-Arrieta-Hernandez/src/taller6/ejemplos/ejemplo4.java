/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo4 {
    // Paquete: paquete1
package paquete1;


public class Persona {
protected String nombre;


public Persona(String nombre) {
this.nombre = nombre;
}
}


// Paquete: paquete2
package paquete2;


import paquete1.Persona;


public class Main {
public static void main(String[] args) { Persona p = new Persona("Juan");
System.out.println(p.nombre); // Error de compilación: nombre tiene acceso protegido

}
