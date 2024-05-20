import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n = 0;
        int posicion = 0;
        String cadena;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};

        try {
            System.out.println("Contenido del array antes de modificar:");
            for (double valor : valores) {
                System.out.printf("%.2f ", valor);
            }
            System.out.print("\n\nIntroduce la posición del array a modificar: ");
            cadena = sc.nextLine();
            posicion = Integer.parseInt(cadena);

            System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
            n = sc.nextDouble();

            valores[posicion] = n;

            System.out.println("\nPosición a modificar " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (double valor : valores) {
                System.out.printf("%.2f ", valor);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada proporcionada no es un número entero válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: La posición proporcionada está fuera de los límites del array.");
        } catch (InputMismatchException e) {
            System.out.println("Error: La entrada proporcionada no es un número válido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}