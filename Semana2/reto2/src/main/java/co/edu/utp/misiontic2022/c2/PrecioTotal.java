package co.edu.utp.misiontic2022.c2;

public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Computadores[] listaComputadores;

    public PrecioTotal(Computadores[] listaComputadores) {
        this.listaComputadores = listaComputadores;
    }

    public void mostrarTotales() {
        // preciototal
        for (Computadores pc : listaComputadores) {
            if (pc instanceof Computadores) {
                totalComputadores += pc.calcularPrecio();
            }
            if (pc instanceof ComputadoresMesa) {
                totalComputadoresMesa += pc.calcularPrecio();
            }
            if (pc instanceof ComputadoresPortatiles) {
                totalComputadoresPortatiles += pc.calcularPrecio();
            }
        }

        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
    }

}
