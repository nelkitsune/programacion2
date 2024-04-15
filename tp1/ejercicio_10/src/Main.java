import Boock.*;
public class Main {
    public static void main(String[] args) {
                // Probando la clase Libro
                Bock libro1 = new Bock("La Sombra del Viento", "Carlos Ruiz Zafón");
                libro1.setPrecio(20.50);
                libro1.imprimirInfo();
                System.out.println();

                // Probando la clase LibroTexto
                BockTxt libroTexto1 = new BockTxt("Matemáticas 1", "Juan Pérez", "1º de Bachillerato");
                libroTexto1.setPrecio(30.75);
                libroTexto1.imprimirInfo();
                System.out.println();

                // Probando la clase LibroUNal
                LibroUNal libroUNal1 = new LibroUNal("Física 2", "María Gómez", "2º Semestre", "Facultad de Ciencias");
                libroUNal1.setPrecio(25.99);
                libroUNal1.imprimirInfo();
                System.out.println();

                // Probando la clase Novela
                Novela novela1 = new Novela("Cien años de soledad", "Gabriel García Márquez", "Realista");
                novela1.setPrecio(15.00);
                novela1.imprimirInfo();
            }
        }

