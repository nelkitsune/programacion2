import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        int intentos = 0;

        int adivinanza = 0;


        Scanner scanner = new Scanner(System.in);


        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");


        while (adivinanza != numeroSecreto) {

            System.out.print("Introduce tu adivinanza: ");
            try {
                adivinanza = scanner.nextInt();
                intentos++;
                if (adivinanza < numeroSecreto) {
                    System.out.println("El número secreto es mayor.");
                } else if (adivinanza > numeroSecreto) {
                    System.out.println("El número secreto es menor.");
                } else {

                    System.out.println("¡Felicidades! Has adivinado el número.");
                    System.out.println("Lo has adivinado en " + intentos + " intentos.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("solo puedes usar numeros enteros!");
                adivinanza = 0;
                scanner.next();
                intentos++;
            }


        }
        System.out.println("Adios");
        scanner.close();
    }
}
