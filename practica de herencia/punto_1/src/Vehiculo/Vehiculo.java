package Vehiculo;

public abstract class Vehiculo {
    protected String color;
    protected int ruedas;
    protected String nombre;

    public Vehiculo() {
    }
    public Vehiculo(String nombre,String color, int ruedas) {
        this.nombre=nombre;
        this.color = color;
        this.ruedas = ruedas;
    }

    public  String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
