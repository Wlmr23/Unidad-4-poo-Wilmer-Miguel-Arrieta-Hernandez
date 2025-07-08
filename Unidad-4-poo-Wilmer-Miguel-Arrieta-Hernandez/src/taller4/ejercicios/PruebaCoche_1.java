/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaCoche {
        public static void main(String[] args) {
        Coche coche = new Coche();
       
        coche.setMarca("Toyota");
        coche.setModelo("Yaris");
        coche.setVelocidadMaxima(180);

        coche.acelerar(20);
        coche.mostrarDatos();
    }
}

