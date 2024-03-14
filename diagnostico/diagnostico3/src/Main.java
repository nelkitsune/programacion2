import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num_a = sc.nextInt();
        System.out.print("ingrese el segundo numero: ");
        int num_b = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (num_a + Math.random() * (num_b - num_a + 1));
            System.out.println(randomNumber);
        }
    }
}