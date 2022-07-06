public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60, 13000, 1.4));

        BecaUniversitaria beca2 = new BecaUniversitaria(48, 10000, 2);
        System.out.println(beca2.calcularInteresSimple());
        System.out.println(beca2.calcularInteresCompuesto());
        System.out.println(beca2.compararInversion());

        BecaUniversitaria becaUniversitaria3 = new BecaUniversitaria();
        System.out.println(becaUniversitaria3.calcularInteresSimple());
        System.out.println(becaUniversitaria3.calcularInteresCompuesto());
        System.out.println(becaUniversitaria3.compararInversion());

        System.out.println("Hola");

    }
}

class BecaUniversitaria {
    private int tiempo;
    private double monto;
    private double interes;

    public BecaUniversitaria(int tiempo, double monto, double interes) {
        this.tiempo = tiempo;
        this.monto = monto;
        this.interes = interes;
    }

    public BecaUniversitaria() {
        this.tiempo = 0;
        this.interes = 0;
        this.monto = 0;
    }

    public double calcularInteresSimple() {
        double interesSimple = monto * interes / 100 * tiempo;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto() {
        double interesCompuesto = monto * (Math.pow(1 + interes / 100, tiempo) - 1);
        return Math.round(interesCompuesto);
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.tiempo = pTiempo;
        this.interes = pInteres;
        this.monto = pMonto;

        double inversion = calcularInteresCompuesto() - calcularInteresSimple();
        if (inversion != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + inversion;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }

    public String compararInversion() {
        double inversion = 0;
        inversion = calcularInteresCompuesto() - calcularInteresSimple();
        if (inversion != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + inversion;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }

}
