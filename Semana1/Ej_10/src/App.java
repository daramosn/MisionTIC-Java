public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int dia = 12;
        int mes = 7;
        int anio = 1980;

        int numSuerte = dia + mes + anio;
        int acumulador = 0;
        while (numSuerte != 0) {
            acumulador = acumulador + (numSuerte % 10);
            numSuerte /= 10;
            System.out.println("acum: " + acumulador);
        }

        System.out.println("El número es: " + acumulador);
    }
}
