import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MaxPrimePositionFinder implements Iterable<Integer> {
    private List<Integer> numbers;

    public MaxPrimePositionFinder(int size) {
        numbers = new ArrayList<>(size);
    }

    public void readNumbers(Scanner scanner) {
        System.out.println("Ingrese los 10 enteros:");

        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }
    }

    public int getMaxPrimePosition() {
        int maxPrime = -1;
        int maxPrimePosition = -1;

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (isPrime(currentNumber) && currentNumber > maxPrime) {
                maxPrime = currentNumber;
                maxPrimePosition = i;
            }
        }

        return maxPrimePosition;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }
}
