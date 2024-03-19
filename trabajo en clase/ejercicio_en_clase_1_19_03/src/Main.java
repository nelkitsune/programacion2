import Trabajadores.Oficial;
import Trabajadores.Tecnico;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico1 = new Tecnico("manuel", "Novato","Informatica");
        System.out.println(tecnico1.toString());
        Oficial oficial = new Oficial("thade","supervisor",24);
        System.out.println(oficial.toString());

    }
}