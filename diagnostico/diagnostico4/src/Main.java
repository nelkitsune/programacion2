import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero para saber si es primo: ");
        int num = sc.nextInt();
        boolean condicional = false;
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                contador++;
            }
            if (contador > 2){
                System.out.println("El numero no es primo");
                condicional = true;
                break;
            }
        }
        if (!condicional){
            System.out.println("Es un numero primo");
        }
    }
}