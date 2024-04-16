import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Ingrese los 10 enteros:");

        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        int max = numbers.get(0);
        int maxPosition = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
                maxPosition = i;
            }
        }

        System.out.println("La posición del mayor número leído es: " + maxPosition);

        scanner.close();
    }
}
