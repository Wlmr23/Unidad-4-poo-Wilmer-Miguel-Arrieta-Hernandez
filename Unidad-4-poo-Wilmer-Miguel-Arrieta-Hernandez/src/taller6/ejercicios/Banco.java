/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Banco {
    protected double saldo; // Esto permite que cualquier subclase modifique el saldo directamente

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}

