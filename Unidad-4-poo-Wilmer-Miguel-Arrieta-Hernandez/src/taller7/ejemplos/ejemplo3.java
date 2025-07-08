/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo3 {
    public class Utilidades {
public static void imprimirMensaje(String mensaje) { System.out.println(mensaje);
}
}

// Paquete: paquete1
package paquete1;


class Persona {
public String nombre;


public Persona(String nombre) {
this.nombre = nombre;
}
}


// Paquete: paquete2
package paquete2;


import paquete1.Persona;


public class Main {
public static void main(String[] args) {
Persona p = new Persona("Juan"); // Error de compilación: Persona no es visible
}
}



}
