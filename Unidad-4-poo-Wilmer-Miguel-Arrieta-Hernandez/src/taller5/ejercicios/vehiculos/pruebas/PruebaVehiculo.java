/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.ejercicios.vehiculos.pruebas;
import taller5.ejercicios.vehiculos.Moto;
/**
 *
 * @author WILMER Y ANDREA
 */
public class PruebaVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva");
        moto.mostrarTipo();  
         System.out.println(moto.tipo); 
        moto.mostrarMoto();
    }

}
