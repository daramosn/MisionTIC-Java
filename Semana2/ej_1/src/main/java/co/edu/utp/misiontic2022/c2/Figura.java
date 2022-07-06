package co.edu.utp.misiontic2022.c2;

public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
