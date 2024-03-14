package Animal;

public class Perro extends Animal {
    @java.lang.Override
    public void hacer_sonido() {
        System.out.println("el perro hace guau guau");
    }

    @java.lang.Override
    public void mostrar_informacion() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Raza: "+ getRaza());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Tamañio: "+ getTamanio());
    }

    private String tamanio;

    public Perro(String nombre, String raza, int edad, String tamanio) {
        super(nombre, raza, edad);
        this.tamanio = tamanio;
    }

    public Perro(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
