package taller4.ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo5 {
    public class Persona {
private String nombre;


public Persona(String nombre) {
this.nombre = nombre;
}
}


public class Main {
public static void main(String[] args) { Persona p = new Persona("Juan");
System.out.println(p.nombre); // Error de compilación: nombre tiene acceso privado
}
}

}
