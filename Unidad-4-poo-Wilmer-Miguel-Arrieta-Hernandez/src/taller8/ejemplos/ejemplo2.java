/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo2 {
   
// Clase base
public class Empleado { protected String nombre; protected double salario;


public Empleado(String nombre, double salario) {
this.nombre = nombre;
this.salario = salario;
}


public void mostrarDetalles() {
System.out.println("Nombre: " + nombre + ", Salario: " + salario);
}
}


// Clase derivada
public class Gerente extends Empleado {
private String departamento;


public Gerente(String nombre, double salario, String departamento) {
super(nombre, salario);
this.departamento = departamento;
}


@Override
public void mostrarDetalles() { super.mostrarDetalles(); System.out.println("Departamento: " + departamento);
}
}

}
