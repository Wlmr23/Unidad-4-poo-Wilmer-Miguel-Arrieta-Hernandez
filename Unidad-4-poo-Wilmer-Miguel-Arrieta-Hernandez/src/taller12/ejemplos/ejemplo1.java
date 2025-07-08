/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo1 {
   // Interfaz Volador
public interface Volador {
void volar();
}


// Interfaz Nadador
public interface Nadador {
void nadar();
}


// Clase Pato que implementa ambas interfaces
public class Pato implements Volador, Nadador {
@Override
public void volar() {
System.out.println("El pato está volando.");
}


@Override
public void nadar() {
System.out.println("El pato está nadando.");
}
}


// Clase de prueba
public class Main {
public static void main(String[] args) { 
    Pato pato = new Pato();
pato.volar();
pato.nadar();
        }
    }
}
