package Trabajadores;

public class Oficial extends Operario {
    private int anios_experiencia;

    public Oficial(String nombre, String rango, int anios_experiencia) {
        super(nombre, rango);
        this.anios_experiencia = anios_experiencia;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "anios_experiencia=" + anios_experiencia +
                "} " + super.toString();
    }
}
