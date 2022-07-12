package co.edu.utp.misiontic2022.c2;

public class ComputadoresPortatiles extends Computadores {

    private final static Integer PULGADAS_BASE = 20;
    // private final static Boolean CAMARAITG_BASE = false;
    private Integer pulgadas;
    private boolean camaraITG;

    public ComputadoresPortatiles() {
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W_BASE, PULGADAS_BASE, false);
    }

    public ComputadoresPortatiles(Double precioBase, Integer pesoBase) {
        this(precioBase, pesoBase, CONSUMO_W_BASE, PULGADAS_BASE, false);
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    public Double calcularPrecio() {
        Double adicion = super.calcularPrecio();

        if (pulgadas > 40) {
            adicion += precioBase * 0.3;
        }
        if (camaraITG == true) {
            adicion += 50.0;
        }

        return adicion;
    }

}
