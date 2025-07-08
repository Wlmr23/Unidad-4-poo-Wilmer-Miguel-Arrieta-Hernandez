/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4.ejemplos;

/**
 *
 * @author WILMER Y ANDREA
 */
public class ejemplo1 {
   public class CuentaBancaria {
private double saldo; // Atributo privado para proteger el saldo


public CuentaBancaria(double saldoInicial) {
if (saldoInicial >= 0) {
this.saldo = saldoInicial;
} else {
this.saldo = 0;
}
}


public double getSaldo() {
return saldo;
}


public void depositar(double monto) { 


if (monto > 0) {
saldo += monto;
}
}
}
 
}
