package co.edu.utp.misiontic2022.c2;

public class ComputadoresMesa extends Computadores {

    protected final static Integer ALMACENAMIENTO_BASE = 50;
    protected Integer almacenamiento;

    public ComputadoresMesa() {
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W_BASE, ALMACENAMIENTO_BASE);
    }

    public ComputadoresMesa(Double precioBase, Integer peso) {
        this(precioBase, peso, CONSUMO_W_BASE, ALMACENAMIENTO_BASE);

    }

    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    public Double calcularPrecio() {

        Double adicion = super.calcularPrecio();
        if (almacenamiento > 100) {
            adicion += 50.0;
        }

        return adicion;
    }

    // getters
    public Integer getAlmacenamiento() {
        return almacenamiento;
    }

}
