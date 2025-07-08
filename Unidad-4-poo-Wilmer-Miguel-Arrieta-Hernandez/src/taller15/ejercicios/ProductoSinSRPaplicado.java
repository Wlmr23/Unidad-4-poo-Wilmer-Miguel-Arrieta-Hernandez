/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ProductoSinSRPaplicado {
        private String nombre;
    private double precio;

    public ProductoSinSRPaplicado(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String generarEtiqueta() {
        return nombre + " - $" + precio;
    }

    public double calcularImpuesto() {
        return precio * 0.19;
    }
}

