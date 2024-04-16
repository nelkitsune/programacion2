
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxNumberRepetitionCounter counter = new MaxNumberRepetitionCounter();

        counter.readNumbers(scanner);

        int repetitionCount = counter.countMaxNumberRepetition();
        if (repetitionCount > 0) {
            System.out.println("El mayor número está repetido " + repetitionCount + " veces.");
        } else {
            System.out.println("No se encontraron repeticiones del mayor número.");
        }

        scanner.close();
    }
}
