/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */

    import java.util.*;

 // EJERECICIO FINAL 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Libro
        System.out.println("== Ingresar datos del libro ==");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        libro libro = new libro(titulo, autor, paginas);

        // CuentaBancaria
        System.out.println("\n== Ingresar datos de la cuenta bancaria ==");
        System.out.print("Número de cuenta: ");
        String numCuenta = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipo = sc.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numCuenta, saldo, tipo);

        // Estudiante
        System.out.println("\n== Ingresar datos del estudiante ==");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar detalles
        System.out.println("\n== Detalles ingresados ==");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

        sc.close();
    }
}

