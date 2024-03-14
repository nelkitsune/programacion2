package Animal;

public class Pajaro extends Animal{
    @java.lang.Override
    public void hacer_sonido() {
        System.out.println("el pajaro hace pio pio");
    }
    @java.lang.Override
    public void mostrar_informacion() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Raza: "+ getRaza());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Puede volar: "+ getPuede_volar());
    }
    private String puede_volar;

    public Pajaro(String nombre, String raza, int edad, String puede_volar) {
        super(nombre, raza, edad);
        this.puede_volar = puede_volar;
    }

    public Pajaro(String puede_volar) {
        this.puede_volar = puede_volar;
    }

    public String getPuede_volar() {
        return puede_volar;
    }

    public void setPuede_volar(String puede_volar) {
        this.puede_volar = puede_volar;
    }
}
