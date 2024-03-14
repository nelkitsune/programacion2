import Animal.Animal;
import Animal.Gato;
import Animal.Pajaro;
import Animal.Perro;

public class Main {
    public static void main(String[] args) {
        Perro cachi = new Perro("Cachi","salchicha",4,"mediano");
        Gato tesela = new Gato("Tesela","callejero",9,"liso");
        Pajaro roberto = new Pajaro("Roberto","pinguino",3,"no");

        cachi.mostrar_informacion();
        cachi.hacer_sonido();
        System.out.println("---------");
        tesela.mostrar_informacion();
        tesela.hacer_sonido();
        System.out.println("---------");
        roberto.mostrar_informacion();
        roberto.hacer_sonido();
    }
}