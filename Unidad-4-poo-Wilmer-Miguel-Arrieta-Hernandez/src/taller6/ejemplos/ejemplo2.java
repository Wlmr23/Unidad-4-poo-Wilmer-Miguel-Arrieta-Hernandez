/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo2 {
    package vehiculos;



public class Vehiculo { protected String marca; protected double velocidad;


public Vehiculo(String marca, double velocidad) {
this.marca = marca;
this.velocidad = velocidad;
}


protected void mostrarDetalles() {
System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
}
}


// Clase derivada en el mismo paquete
package vehiculos;


public class Coche extends Vehiculo {
private int puertas;


public Coche(String marca, double velocidad, int puertas) {
super(marca, velocidad);
this.puertas = puertas;
}


public void mostrarInformacion() {
mostrarDetalles(); // Accede al método protegido de la clase base
System.out.println("Número de puertas: " + puertas);
}
}

}
