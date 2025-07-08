/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.ejercicios.Personas;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Persona {
        String nombre;  // Solo accesible dentro de esta clase
    int edad;               // Accesible dentro del mismo paquete

    // Métodos getter y setter para `nombre`
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
}
