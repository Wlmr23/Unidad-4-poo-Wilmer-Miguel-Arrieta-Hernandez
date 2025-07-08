/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Etiqueta {
       public String generarEtiqueta(Producto producto) {
        return producto.getNombre() + " - $" + producto.getPrecio();
    }
}
