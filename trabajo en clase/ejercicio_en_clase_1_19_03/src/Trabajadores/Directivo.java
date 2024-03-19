package Trabajadores;

public class Directivo extends Empleados{
    private String rango;

    public Directivo(String nombre, String rango) {
        super(nombre);
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "rango='" + rango + '\'' +
                '}';
    }
}
