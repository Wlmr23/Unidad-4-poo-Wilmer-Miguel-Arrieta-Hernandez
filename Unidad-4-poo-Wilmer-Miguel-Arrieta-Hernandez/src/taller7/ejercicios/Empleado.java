/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Empleado {
       public String nombre;       // Propiedad pública
    private double salario;     // Salario como privado

    // Getter público para salario
    public double getSalario() {
        return salario;
    }

    // Setter con validación
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser mayor que cero.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}

