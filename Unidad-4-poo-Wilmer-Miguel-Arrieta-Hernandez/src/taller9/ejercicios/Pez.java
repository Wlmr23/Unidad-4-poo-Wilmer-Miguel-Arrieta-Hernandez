/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarDetalles() {
        super.mostrarEspecie(); // Método de clase base
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}