/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo1 {
    

// Clase abstracta
public abstract class Figura {
public abstract double calcularArea(); // Método abstracto


public void mostrarFigura() { System.out.println("Mostrando figura.");
}
}


// Clase derivada
public class Circulo extends Figura {
private double radio;


public Circulo(double radio) {
this.radio = radio;
}


@Override
public double calcularArea() {
return Math.PI * radio * radio;
}
}

}
