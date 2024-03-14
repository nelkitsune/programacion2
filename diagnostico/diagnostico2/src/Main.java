
import funciones.Temperatura;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperatura temperatura_funciones = new Temperatura();
        System.out.println("Bienvenido!");
        while (true){
            System.out.print("ingrese c para pasar de celsius a fahrenheit o presione f para pasar de fahrenheit a celsius. por ultimo presione x para salir: ");
            String option = sc.next();
            option=option.toLowerCase();
            if (option.equals("c")){
                System.out.print("ingrese la temperatura que desea pasar a fahrenheit: ");
                double temperatura = sc.nextDouble();
                System.out.println("La temperatura en fahrenheit es: " + temperatura_funciones.celsius_fahrenheit(temperatura) + " °");
            } else if (option.equals("f")) {
                System.out.print("ingrese la temperatura que desea pasar a celsius: ");
                double temperatura = sc.nextDouble();
                System.out.println("La temperatura en celsius es: " + temperatura_funciones.fahrenheit_celsius(temperatura) + " °");
            }else if(option.equals("x")){
                System.out.println("Adios");
                break;
            }else{
                System.out.println("error. reiniciando el programa");
            }

        }
    }
}