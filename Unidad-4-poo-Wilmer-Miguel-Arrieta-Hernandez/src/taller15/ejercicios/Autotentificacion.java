/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Autotentificacion {
        public boolean autenticar(Usuario usuario, String inputPassword) {
        return usuario.getPassword().equals(inputPassword);
    }
}

