/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.ejercicios.inventario;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaProducto {
       public static void main(String[] args) {
        Producto p = new Producto("Laptop", 1200.0, 5);
        p.mostrarInfo(); // ✅ Acceso permitido dentro del mismo paquete
    }
}

