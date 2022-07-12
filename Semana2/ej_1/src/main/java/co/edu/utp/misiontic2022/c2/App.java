package co.edu.utp.misiontic2022.c2;

import java.text.Format;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! :(");

        Scanner sc = new Scanner(System.in);

        String colorT;
        double baseT;
        double alturaT;

        System.out.println("Ingrese el color del triangulo: ");
        colorT = sc.nextLine();
        System.out.println("Ingrese la base del triangulo: ");
        baseT = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        alturaT = sc.nextDouble();
        sc.close();

        Triangulo tr1 = new Triangulo(colorT, baseT, alturaT);
        System.out.printf("El color del triangulo es %s y su area es %f", tr1.getColor(), tr1.calcularArea());
    }
}
