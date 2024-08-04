package com.ymcris.pre.ipc1.logica.ejerciciosalgorítmo;

import java.util.Scanner;

/*Realize un algorítmo que permita determinar el
mayor de dos números ingresados por el usuario.*/
/**
 *
 * @author crist
 */
public class Numeromayor {

    public static void main(String[] args) {
        numeromayor();
    }

    private static void numeromayor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        double Primersumando = scanner.nextDouble();
        System.out.println("Ingrese el segundo número");
        double Segundosumando = scanner.nextDouble();
        if (Primersumando > Segundosumando) {
            System.out.println("El número mayor es: " + Primersumando);
        } else {
            System.out.println("El número mayor es: " + Segundosumando);
        }
    }
}
