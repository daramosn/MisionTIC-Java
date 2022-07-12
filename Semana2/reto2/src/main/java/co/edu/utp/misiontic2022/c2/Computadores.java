package co.edu.utp.misiontic2022.c2;

public class Computadores {

    protected final static Integer PESO_BASE = 5;
    protected final static char CONSUMO_W_BASE = 'F';
    protected final static Double PRECIO_BASE = 100.0;

    protected Integer peso;
    protected char consumoW;
    protected Double precioBase;

    // constructores
    public Computadores() {
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W_BASE);
    }

    public Computadores(Double precioBase, Integer peso) {
        this.peso = peso;
        this.precioBase = precioBase;
        this.consumoW = CONSUMO_W_BASE;
    }

    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    }

    // métodos
    public Double calcularPrecio() {
        Double adicion = 0.0;

        switch (consumoW) {
            case 'A': {
                adicion += 100.0;
                break;
            }
            case 'B': {
                adicion += 80.0;
                break;
            }
            case 'C': {
                adicion += 60.0;
                break;
            }
            case 'D': {
                adicion += 50.0;
                break;
            }
            case 'E': {
                adicion += 30.0;
                break;
            }
            case 'F': {
                adicion += 10.0;
                break;
            }
        }

        if ((peso >= 0) && (peso < 19)) {
            adicion += 10.0;
        }
        if ((peso >= 20) && (peso < 49)) {
            adicion += 50.0;
        }
        if ((peso >= 50) && (peso < 79)) {
            adicion += 80.0;
        }
        if (peso >= 80) {
            adicion += 100.0;
        }
        return precioBase + adicion;
    }

    // getters
    public Integer getPeso() {
        return peso;
    }

    public char getConsumoW() {
        return consumoW;
    }

    public Double getPrecioBase() {
        return precioBase;
    }
}
