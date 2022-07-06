package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! :(");

        Triangulo tr1 = new Triangulo("azul", 5, 10);
        System.out.println("El area de la figura es: " + tr1.calcularArea());
    }
}
