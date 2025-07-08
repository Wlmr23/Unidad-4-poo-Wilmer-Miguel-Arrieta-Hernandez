package taller6.ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo3 {
    
package animales;


public class Animal {
protected String especie;


public Animal(String especie) {
this.especie = especie;
}


protected void emitirSonido() { System.out.println("El animal hace un sonido.");
}
}


package animales;


public class Perro extends Animal {


public Perro(String especie) {
super(especie);
}


@Override
protected void emitirSonido() { System.out.println("El perro ladra.");
}
}

}
