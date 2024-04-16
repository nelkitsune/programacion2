import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumbersEndingInFourFinder implements Iterable<Integer> {
    private List<Integer> numbers;

    public NumbersEndingInFourFinder() {
        numbers = new ArrayList<>();
    }

    public void readNumbers(Scanner scanner) {
        System.out.println("Ingrese los 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }
    }

    public List<Integer> getPositionsOfNumbersEndingInFour() {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 10 == 4) {
                positions.add(i);
            }
        }
        return positions;
    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }
}
