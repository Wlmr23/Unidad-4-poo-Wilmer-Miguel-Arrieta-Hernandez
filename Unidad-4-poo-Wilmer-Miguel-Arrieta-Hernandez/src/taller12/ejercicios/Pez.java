/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public interface Nadador {
    void nadar();
}
public interface Respirador {
    void respirar();
}
public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez está nadando en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez está respirando a través de sus branquias.");
    }
}

