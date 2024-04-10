package Figura;

public class Rectangulo extends Geometric_figur{
    private double longitud;
    private double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    @Override
    public double calcularArea() {
        return longitud * anchura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }
}
