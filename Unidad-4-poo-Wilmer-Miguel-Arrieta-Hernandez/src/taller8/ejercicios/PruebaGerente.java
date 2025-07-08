/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaGerente {

    public static void main(String[] args) {
        Empleado e = new Empleado("Carlos", 3000.0);
        e.mostrarDetalles();

        System.out.println();

        Gerente g = new Gerente("Ana", 5000.0, "Recursos Humanos");
        g.mostrarDetalles();
    }
}
