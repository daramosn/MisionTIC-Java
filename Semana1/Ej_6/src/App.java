import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");

        int num = sc.nextInt();

        System.out.println("La cantidad de dígitos del número es: ");
        System.out.println(digitos(num) + " :)");

    }

    public static int digitos(int numero) {
        int cont = 0;
        while (numero >= 1) {
            numero = numero / 10;
            cont++;
        }
        return cont;
    }
}
