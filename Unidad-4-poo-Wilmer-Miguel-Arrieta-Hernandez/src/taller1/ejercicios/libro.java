/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.ejercicios;

/**
 *
 * @author WILMER Y ANDREA
 */
public class libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
    }
}

