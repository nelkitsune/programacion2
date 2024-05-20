import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();

            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();

            double area = (base * altura) / 2;

            System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);

            scanner.close();
        }catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getClass().getName() + ": " + e.getMessage());
            System.out.println("Cerrando el programa por seguridad. Por favor, reinicia el programa.");
        }

    }
}
