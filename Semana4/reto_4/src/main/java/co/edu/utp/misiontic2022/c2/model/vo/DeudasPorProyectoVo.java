package co.edu.utp.misiontic2022.c2.model.vo;

public class DeudasPorProyectoVo {

    private Integer id;
    private double valor;

    public DeudasPorProyectoVo() {
    }

    public DeudasPorProyectoVo(Integer id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%3d %,15.1f", this.id, this.valor);
    }

}
