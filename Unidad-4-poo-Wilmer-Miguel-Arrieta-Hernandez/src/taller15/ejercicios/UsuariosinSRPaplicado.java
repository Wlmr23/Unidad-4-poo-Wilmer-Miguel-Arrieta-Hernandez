/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class UsuariosinSRPaplicado {
    private String username;
    private String password;

    public boolean autenticar(String inputPassword) {
        return this.password.equals(inputPassword);
        }

    public boolean validarFormato() {
        return username.length() >= 3 && password.length() >= 6;
        }
    }
