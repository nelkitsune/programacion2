package Animal;

public class Gato extends Animal{
    @java.lang.Override
    public void hacer_sonido() {
        System.out.println("el gato hace miu miu");
    }

    @java.lang.Override
    public void mostrar_informacion() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Raza: "+ getRaza());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Patron de pelage: "+ getPatron_color());
    }

    private String patron_color;

    public Gato(String nombre, String raza, int edad, String patron_color) {
        super(nombre, raza, edad);
        this.patron_color = patron_color;
    }

    public Gato(String patron_color) {
        this.patron_color = patron_color;
    }

    public String getPatron_color() {
        return patron_color;
    }

    public void setPatron_color(String patron_color) {
        this.patron_color = patron_color;
    }
}
