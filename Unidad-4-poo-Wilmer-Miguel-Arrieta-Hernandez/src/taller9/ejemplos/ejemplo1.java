/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo1 {
    
public class Animal {
protected String especie;


public Animal(String especie) {
this.especie = especie;
}
} 




public class Perro extends Animal {
private String raza;


public Perro(String especie, String raza) {
super(especie); // Llama al constructor de la clase base
this.raza = raza;
}
}
}
