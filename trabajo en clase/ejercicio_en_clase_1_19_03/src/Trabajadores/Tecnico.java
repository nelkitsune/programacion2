package Trabajadores;

public class Tecnico extends Operario{
    private String area_especialisacion;

    public Tecnico(String nombre, String rango, String area_especialisacion) {
        super(nombre, rango);
        this.area_especialisacion = area_especialisacion;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "area_especialisacion='" + area_especialisacion + '\'' +
               '}' + "\nNombre: "+getNombre()
                + "\nRango: "+ getRango();
    }

}
