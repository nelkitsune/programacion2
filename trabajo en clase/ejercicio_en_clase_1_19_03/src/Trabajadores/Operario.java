package Trabajadores;

public class Operario extends Empleados{

    private String rango;

    public Operario(String nombre, String rango) {
        super(nombre);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "rango='" + rango + '\'' +
                '}';
    }
}
