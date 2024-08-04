package com.ymcris.pre.ipc1.logica.ejerciciosalgorítmo;

import java.util.Scanner;

/**
 *
 * @author crist
 * @see Numeromayor
 * @version 21.0.2
 */
public class Calificaciones {

    public static void main(String[] args) {
        calificaciones();
    }

    private static void calificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la puntuación del estudiante:");
        double puntuación = scanner.nextDouble();
        if (puntuación >= 90 && puntuación <= 100) {
            System.out.println("La calificación de " + nombre + " es del rango A." + "\n");
            puntuaciones();
        } else if (puntuación >= 80 && puntuación <= 89) {
            System.out.println("La calificación de " + nombre + " es del rango B." + "\n");
            puntuaciones();
        } else if (puntuación >= 70 && puntuación <= 79) {
            System.out.println("La calificación de " + nombre + " es del rango C." + "\n");
            puntuaciones();
        } else if (puntuación >= 60 && puntuación <= 69) {
            System.out.println("La calificación de " + nombre + " es del rango D." + "\n");
            puntuaciones();
        } else if (puntuación >= 0 && puntuación <= 59) {
            System.out.println("La calificación de " + nombre + " es del rango F." + "\n");
            puntuaciones();
        } else {
            System.out.println("La puntuación no es válida, Por favor, ingrese una nota del 0-100.");
            calificaciones();
        }
    }

    private static void puntuaciones() {
        System.out.println(
                "• A: 90 - 100 \n"
                + "• B: 80 - 89 \n"
                + "• C: 70 - 79 \n"
                + "• D: 60 - 69 \n"
                + "• F: 0 - 59");
    }
}
