package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Computadores pc1 = new Computadores();
        // System.out.println(pc1.calcularPrecio());
        // ComputadoresMesa pc2 = new ComputadoresMesa(70.0, 40);
        // System.out.println(pc2.calcularPrecio());
        // ComputadoresPortatiles pc2 = new ComputadoresPortatiles(600.0, 70, 'D', 50,
        // false);
        // System.out.println(pc2.calcularPrecio());

        Computadores computadores[] = new Computadores[4];
        computadores[0] = new Computadores(60.0, 10, 'D');
        computadores[1] = new ComputadoresMesa(300.0, 40, 'Z', 40);
        computadores[2] = new ComputadoresPortatiles(50.0, 10, 'A', 70, false);
        computadores[3] = new Computadores(50.0, 10);
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();

    }
}
