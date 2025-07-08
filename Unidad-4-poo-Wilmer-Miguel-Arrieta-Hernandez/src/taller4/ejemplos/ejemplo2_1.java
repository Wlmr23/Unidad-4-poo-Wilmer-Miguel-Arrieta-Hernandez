/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo2 {
    public class Persona { private String nombre; private int edad;


public Persona(String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;
}


public String getNombre() {
return nombre;
}


public void setNombre(String nombre) {
this.nombre = nombre;
}


public int getEdad() {
return edad;
}


public void setEdad(int edad) {
if (edad >= 0) {
this.edad = edad;
}
}
}


}
