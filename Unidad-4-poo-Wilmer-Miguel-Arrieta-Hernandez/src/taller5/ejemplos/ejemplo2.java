/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo2 {
   
// Clase con miembros de paquete (default)
class Empleado { String nombre; double salario;


Empleado(String nombre, double salario) {
this.nombre = nombre;
this.salario = salario;
}


void mostrarInformacion() {
System.out.println("Nombre: " + nombre + ", Salario: " + salario);
}
}

 
}
