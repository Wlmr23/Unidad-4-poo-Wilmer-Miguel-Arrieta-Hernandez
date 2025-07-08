/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Validacion {
       public boolean validar(Usuario usuario) {
        return usuario.getUsername().length() >= 3 && usuario.getPassword().length() >= 6;
        }
}

