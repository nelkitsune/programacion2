import funciones.Primos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Primos primo = new Primos();
        int num_minimo;
        int num_maximo;
        while (true){
            System.out.print("ingrese el numero minimo del rango: ");
            num_minimo = sc.nextInt();
            System.out.print("ingrese el numero maximo del rango: ");
            num_maximo = sc.nextInt();
            if (num_minimo >= num_maximo){
                System.out.println("el numero minimo tiene que ser menor que el numero maximo. reiniciando el programa...");
                continue;
            }
            for (int i = num_minimo+1; i < num_maximo; i++) {
                primo.saber_primo(i);
            }
        }
    }
}