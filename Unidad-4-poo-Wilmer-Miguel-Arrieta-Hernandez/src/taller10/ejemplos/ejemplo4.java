/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo4 {
   
// Clase base
public class Vehiculo {
public void acelerar(int velocidad) {
System.out.println("El vehículo acelera a " + velocidad + " km/h.");
}
}


// Clase derivada (incorrecta)
public class Coche extends Vehiculo {
// Error de compilación: Diferente firma del método
    
@Override

public void acelerar() { System.out.println("El coche acelera.");
}
} 
}
