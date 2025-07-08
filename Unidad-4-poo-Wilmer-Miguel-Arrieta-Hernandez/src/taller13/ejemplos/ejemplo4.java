/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo4 {
    

// Clase abstracta
public abstract class Animal {
public abstract void hacerSonido();
}


// Clase derivada incorrecta
public class Gato extends Animal {
// Aunque el método hacerSonido no se sobrescribe, el error se evita por falta de visibilidad o error lógico.
}

}
