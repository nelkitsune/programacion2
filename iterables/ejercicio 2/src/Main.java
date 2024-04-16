import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxPrimePositionFinder maxPrimePositionFinder = new MaxPrimePositionFinder(10);

        maxPrimePositionFinder.readNumbers(scanner);

        int maxPrimePosition = maxPrimePositionFinder.getMaxPrimePosition();
        if (maxPrimePosition != -1) {
            System.out.println("La posición del mayor número primo leído es: " + maxPrimePosition);
        } else {
            System.out.println("No se encontró ningún número primo en la lista.");
        }

        scanner.close();
    }
}

