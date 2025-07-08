/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class DetalleEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Laura", 3000.0);
        Empleado vendedor = new Vendedor("Carlos", 20000.0, 0.05);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}

