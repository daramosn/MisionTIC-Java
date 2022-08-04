package co.edu.utp.misiontic2022.c2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // try {
        // System.out.println("Intentamos ejecutar el bloque de instrucciones");
        // System.out.println("Instrucción 1");
        // System.out.println("Instrucción 2");

        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println("Se produjo un error");
        // } finally {
        // System.out.println("Instrucción al ejecutar final se produce ya sea por el
        // error o no");
        // }

        // int[] array = new int[5];
        // try {
        // array[-4] = 5;
        // int a = 10 / 0;
        // } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
        // System.out.println("Error inesperado " + ex.getMessage());
        // }

        // Scanner sc = new Scanner(System.in);
        // int numero;
        // try {
        // System.out.println("Ingrese nuemero entero: ");
        // numero = sc.nextInt();
        // System.out.println("El cuadrado de " + numero + " es: " + numero * numero);
        // } catch (InputMismatchException e) {
        // System.out.println("Error, ingrese un numero");
        // // TODO: handle exception
        // }

        Matematicas mate = new Matematicas();
        double resultado = mate.dividir(10, 0);
        System.out.println("El resultado es " + resultado);

    }
}
