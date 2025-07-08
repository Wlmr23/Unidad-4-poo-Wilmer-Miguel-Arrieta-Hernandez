/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.setNombre("María");
        est.setEdad(19);
        est.setNotaPromedio(4.5);

        est.mostrarInfo();
    }
}

