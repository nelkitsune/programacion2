import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MaxNumberRepetitionCounter implements Iterable<Integer> {
    private List<Integer> numbers;

    public MaxNumberRepetitionCounter() {
        numbers = new ArrayList<>();
    }

    public void readNumbers(Scanner scanner) {
        System.out.println("Ingrese los 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }
    }

    public int countMaxNumberRepetition() {
        int max = numbers.get(0);
        int count = 0;

        for (int num : numbers) {
            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }
        }

        return count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }
}
