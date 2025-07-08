/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo1 {
    
    // Clase base en un paquete específico
   package vehiculos;
public class Vehiculo {
protected String tipo;


public Vehiculo(String tipo) {
this.tipo = tipo;
}


protected void mostrarTipo() { System.out.println("Tipo de vehículo: " + tipo);
}
}



}
