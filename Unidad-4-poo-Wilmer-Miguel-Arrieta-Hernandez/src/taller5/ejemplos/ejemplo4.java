/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo4 {
    // Clase Producto con nivel de acceso de paquete
class Producto {
String nombre; // Atributo de paquete (default)
double precio; // Atributo de paquete (default)


Producto(String nombre, double precio) {
this.nombre = nombre;
this.precio = precio;
}


void mostrarInfo() {
System.out.println("Nombre: " + nombre + ", Precio: " + precio);
}
}

}
