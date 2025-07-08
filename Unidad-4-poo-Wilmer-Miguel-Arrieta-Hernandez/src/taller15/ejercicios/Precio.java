/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Precio {
        public double calcularImpuesto(Producto producto) {
        return producto.getPrecio() * 0.19;
    }

    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecio() + calcularImpuesto(producto);
    }
}

