/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo4 {
    
// Clase base
public class Vehiculo {
public void mover() {
System.out.println("El vehículo se está moviendo.");
}
}


// Clase derivada
public class Moto extends Vehiculo {
@Override
public void mover() {
super.mover(); // Uso innecesario si no se modifica el comportamiento
}
}
}
