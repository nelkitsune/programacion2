import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumbersEndingInFourFinder finder = new NumbersEndingInFourFinder();

        finder.readNumbers(scanner);

        List<Integer> positions = finder.getPositionsOfNumbersEndingInFour();
        if (!positions.isEmpty()) {
            System.out.println("Los números terminados en 4 se encuentran en las posiciones:");
            for (int position : positions) {
                System.out.println(position);
            }
        } else {
            System.out.println("No se encontraron números terminados en 4.");
        }

        scanner.close();
    }
}
