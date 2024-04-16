import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNumberGenerator implements Iterable<Integer> {
    private List<Integer> primeNumbers;

    public PrimeNumberGenerator() {
        primeNumbers = new ArrayList<>();
        generatePrimeNumbers();
    }

    private void generatePrimeNumbers() {
        int count = 0;
        for (int i = 100; i <= 300; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
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
        return primeNumbers.iterator();
    }
}