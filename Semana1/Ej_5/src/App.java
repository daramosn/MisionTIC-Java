import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println(saludar(nombre));

    }

    public static String saludar(String nom) {
        return "Hola " + nom + " :)";
    }
}
