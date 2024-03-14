import metodos_calculadora.Operaciones;

import java.util.Scanner;

//1.Crea una calculadora simple en Java que pueda realizar operaciones básicas como suma, resta, multiplicación y
// división. El programa debe solicitar al usuario que ingrese dos números y luego le permitirle elegir la operación
// que desea realizar. Una vez completada la operación, debe mostrar el resultado al usuario. Cada operación debe
// implementarse en un método diferente. El programa principal debe llamar a estos métodos según la operación
// seleccionada por el usuario.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones calculadora = new Operaciones();
        System.out.println("Bienvenido a la calculadora basica");
        while (true){
            System.out.print("Ingrese el primer numero: ");
            double num_a = sc.nextDouble();
            System.out.print("ingrese el segundo numero: ");
            double num_b = sc.nextDouble();
            System.out.print("que operacion desea realizar? Coloque el signo correspondiente (+ suma, - resta, / division y * multiplicacion): ");
            String option = sc.next();
            switch (option) {
                case "+" -> System.out.println("El resultado es = " + calculadora.suma(num_a, num_b));
                case "-" -> System.out.println("El resultado es = " + calculadora.resta(num_a, num_b));
                case "*" -> System.out.println("El resultado es = " + calculadora.multiplicacion(num_a, num_b));
                case "/" -> System.out.println("El resultado es = " + calculadora.divicion(num_a, num_b));
                default ->
                        System.out.println("error al ingresar los datos, por favor coloque solo un signo a la ves y que sean los indicados");
            }
            System.out.print("Desea reiniciar el programa? a para reiniciar. precione cualquier otro boton para salir: ");
            String reinicio = sc.next();
            if (reinicio.equals("a")){
                continue;
            }else {
                break;
            }
        }
    }
}