import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola amigo");

        int x=25;

        System.out.println("El número es:\n" + x);

        Scanner sc= new Scanner(System.in);

        System.out.println("Por favor escriba algo: ");
        String algo = sc.nextLine();

        System.out.println("Escribió: "+ algo);

    }
}
