/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaCuentaBancaria {
        public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 5000.0, "Ahorros");

        cuenta.setSaldo(6000.0);
        cuenta.mostrarDetalles();

        // ❌ Error si se descomenta (acceso privado)
        // System.out.println(cuenta.numeroCuenta); // Error de compilación
    }
}

