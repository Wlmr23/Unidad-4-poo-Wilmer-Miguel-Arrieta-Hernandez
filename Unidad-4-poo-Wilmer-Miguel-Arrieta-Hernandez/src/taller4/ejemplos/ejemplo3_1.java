/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo3 {
    
public class Vehiculo { private String marca; private double velocidad;

public Vehiculo(String marca, double velocidad) {
this.marca = marca;
this.velocidad = velocidad;
} 

}	

public String getMarca() {
return marca;
}


public double getVelocidad() {
return velocidad;
}


public void acelerar(double incremento) {
if (incremento > 0) {
velocidad += incremento;
}
}

}
