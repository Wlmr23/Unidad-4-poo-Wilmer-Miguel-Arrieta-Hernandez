/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.ejercicios.Personas;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaPersona {
        public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setNombre("Pedro");         //   Válido por método público
        System.out.println(p.getNombre()); //  Válido

        p.edad = 30;                  // Acceso permitido (dentro del mismo paquete)
        System.out.println("Edad: " + p.edad);

        System.out.println(p.nombre); // Error: 'nombre' es private
    }
}

